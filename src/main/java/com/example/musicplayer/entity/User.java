package com.example.musicplayer.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(unique=true, name = "name", length = 100)
    private String name;

    @Column(name = "pass", length = 500)
    private String pass;

    @ManyToMany()
    private List<Song> songs;

    public void addSong(Song song){
        boolean exist = false;
        for(Song s : songs){
            if(s.getName().equals(song.getName())){
                exist = true;
                break;
            }
        }

        if(!exist){
            songs.add(song);
        }
    }

    public void removeSong(long id){
        songs.remove((int) id-1);
    }

    public List<Song> getSongs() {
        return songs;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
