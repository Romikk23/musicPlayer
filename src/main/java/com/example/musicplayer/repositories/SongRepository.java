package com.example.musicplayer.repositories;

import com.example.musicplayer.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository  extends JpaRepository<Song, Long> {
    boolean existsByName(String name);
}
