package com.example.musicplayer.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "song")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(unique = true, name = "name", length = 100)
    private String name;

    @Column(name = "file", length = 500)
    private String file;

    @Column(name = "image", length = 500)
    private String image;


    public String getName() {
        return name;
    }

    public String getFile() {
        return file;
    }

    public String getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
