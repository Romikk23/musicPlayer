package com.example.musicplayer.controllers;

import com.example.musicplayer.entity.Song;
import com.example.musicplayer.entity.User;
import com.example.musicplayer.repositories.SongRepository;
import com.example.musicplayer.repositories.UserRepository;
import com.example.musicplayer.utils.TrackListUtil;
import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Controller
@AllArgsConstructor
public class MainController {

    private SongRepository songRepository;
    private UserRepository userRepository;

    @PostConstruct
    public void initialize(){
        List<Song> songs = TrackListUtil.getTrackList();
        for (Song song : songs) {
            boolean exist = songRepository.existsByName(song.getName());
            if(!exist) {
                songRepository.save(song); // Не зовсім шарю як додавати через репозиторії без повторів, якшо стоїть unique
            }

        }
    }
    @GetMapping("/")
    public String startFirst(Model model) {
        List<Song> songs = songRepository.findAll();
        model.addAttribute("songs", songs);
        model.addAttribute("userid", 0);
        model.addAttribute("name", "");
        return "index";
    }

    @GetMapping("/index/{id}")
    public String showMainPageUser(@PathVariable("id") long id, Model model) {
        Optional<User> user = userRepository.findById(id);
        List<Song> songs = songRepository.findAll();
        if(!user.isEmpty()) {
            model.addAttribute("songs", songs);
            model.addAttribute("userid", user.get().getId());
            model.addAttribute("name", user.get().getName());
        } else {
            model.addAttribute("songs", songs);
            model.addAttribute("userid", 0);
            model.addAttribute("name", "");
        }
        return "index";
    }

    @GetMapping("/rek/{id}")
    public String showRekPageUser(@PathVariable("id") long id, Model model) {
        Optional<User> user = userRepository.findById(id);
        List<Song> songs;
        if(!user.isEmpty()) {
            songs = user.get().getSongs();
            model.addAttribute("songs", songs);
            model.addAttribute("userid", user.get().getId());
            model.addAttribute("name", user.get().getName());
        } else {
            songs = new ArrayList<>();
            model.addAttribute("songs", songs);
            model.addAttribute("userid", 0);
            model.addAttribute("name", "");
        }
        return "rek";
    }

    @PostMapping("/registration")
    @Transactional
    public String registration(@RequestParam String name, @RequestParam String pass) {
        Optional<User> user = userRepository.findByName(name);
        if(user.isEmpty()){
            user = Optional.of(new User());
            user.get().setName(name);
            user.get().setPass(pass);
            userRepository.save(user.get());
        } else {
            if(!user.get().getPass().equals(pass)){
                return "redirect:/rek/0";
            }
        }
        return "redirect:/rek/"+user.get().getId();
    }

    @GetMapping("/add/{index}/user/{id}")
    @Transactional
    public String addFavorite(@PathVariable("index") long index, @PathVariable("id") long id) {
        Optional<User> user = userRepository.findById(id);
        Optional<Song> song = songRepository.findById(index);
        if(user.isEmpty()) {
            return "redirect:/index/0";
        } else {
            User u = user.get();
            Song s = song.get();
            u.addSong(s);

            userRepository.save(u);
            return "redirect:/index/"+u.getId();
        }
    }

    @GetMapping("/delete/{index}/user/{id}")
    @Transactional
    public String deleteFavorite(@PathVariable("index") long index, @PathVariable("id") long id) {
        Optional<User> user = userRepository.findById(id);
        if(user.isEmpty()) {
            return "redirect:/rek/0";
        } else {
            User u = user.get();
            Collection<Song> songs = u.getSongs();
            u.removeSong(index);

            userRepository.save(u);
            return "redirect:/rek/"+u.getId();
        }
    }
}
