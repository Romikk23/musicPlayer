package com.example.musicplayer.utils;

import com.example.musicplayer.entity.Song;

import java.util.ArrayList;

public class TrackListUtil {
    public static ArrayList<Song> getTrackList(){
        ArrayList<Song> songs = new ArrayList<>();
        Song song1 = new Song();
        song1.setName("Smells Like Teen Spirit – Nirvana");
        song1.setFile("https://soundhelix.com/examples/mp3/SoundHelix-Song-1.mp3");
        song1.setImage("https://images.saymedia-content.com/.image/t_share/MTc0NDkxNzgyMzYzNDg5NjQw/vinyl-to-paper-how-to-write-an-album-review.jpg");
        songs.add(song1);

        Song song2 = new Song();
        song2.setName("Billie Jean – Michael Jackson");
        song2.setFile("https://soundhelix.com/examples/mp3/SoundHelix-Song-2.mp3");
        song2.setImage("https://static-cse.canva.com/blob/978199/1600w-8iSVF3m00jk.jpg");
        songs.add(song2);

        Song song3 = new Song();
        song3.setName("Stayin’ Alive – Bee Gees");
        song3.setFile("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-3.mp3");
        song3.setImage("https://1757140519.rsc.cdn77.org/blog/wp-content/uploads/sites/2/2021/02/DouqiR_U4AAoziP-1024x1024.jpg");
        songs.add(song2);

        Song song4 = new Song();
        song4.setName("I Will Survive – Gloria Gaynor");
        song4.setFile("https://soundhelix.com/examples/mp3/SoundHelix-Song-4.mp3");
        song4.setImage("https://d1csarkz8obe9u.cloudfront.net/posterpreviews/copy-of-minimalistic-album-cover-design-template-0522d9e65746d87bba3e1a0d81f5a75b_screen.jpg?ts=1561532200");
        songs.add(song4);

        Song song5 = new Song();
        song5.setName("Whole Lotta Love – Led Zeppelin");
        song5.setFile("https://soundhelix.com/examples/mp3/SoundHelix-Song-5.mp3");
        song5.setImage("https://static.apostrophe.ua/uploads/image/db82422e17632f29fb2f68fb193454ff.PNG");
        songs.add(song5);

        Song song6 = new Song();
        song6.setName("Sweet Child O’Mine – Guns N’ Roses");
        song6.setFile("https://soundhelix.com/examples/mp3/SoundHelix-Song-6.mp3");
        song6.setImage("https://upload.wikimedia.org/wikipedia/ru/0/03/Обложка_альбома_Trapsoul.jpg");
        songs.add(song6);

        Song song7 = new Song();
        song7.setName("Scream And Shout – Will.I.Am & Brittney Spears");
        song7.setFile("https://soundhelix.com/examples/mp3/SoundHelix-Song-7.mp3");
        song7.setImage("https://www.allkpop.com/upload/2018/06/content/black-pink_1528425008_lqd6b4asto211.jpg");
        songs.add(song7);

        Song song8 = new Song();
        song8.setName("Santeria – Sublime");
        song8.setFile("https://soundhelix.com/examples/mp3/SoundHelix-Song-8.mp3");
        song8.setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSguwxS_9dblWRUAmW-0YMRWCD--S1-n8vxpQ&usqp=CAU");
        songs.add(song8);

        Song song9 = new Song();
        song9.setName("Alright – Kendrick Lamar");
        song9.setFile("https://soundhelix.com/examples/mp3/SoundHelix-Song-9.mp3");
        song9.setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQgDdi6osoII8mbu6sTmKbbs0L7-gN2rEqnUA&usqp=CAU");
        songs.add(song9);

        Song song10 = new Song();
        song10.setName("Thrift Shop – Macklemore & Ryan Lewis");
        song10.setFile("https://soundhelix.com/examples/mp3/SoundHelix-Song-10.mp3");
        song10.setImage("https://noizr.com/files/page/15/5d5309ca8a62c1.jpg?11282");
        songs.add(song10);

        Song song11 = new Song();
        song11.setName("Blurred Lines – Robin Thicke & Pharrell Williams");
        song11.setFile("https://soundhelix.com/examples/mp3/SoundHelix-Song-11.mp3");
        song11.setImage("https://www.allkpop.com/upload/2018/06/content/black-pink_1528425108_1wyxxr3frj211.jpg");
        songs.add(song11);

        Song song12 = new Song();
        song12.setName("Stairway To Heaven – Led Zeppelin");
        song12.setFile("https://soundhelix.com/examples/mp3/SoundHelix-Song-12.mp3");
        song12.setImage("https://upload.wikimedia.org/wikipedia/ru/thumb/f/fc/Обложка_альбома_дуэта_AINA_«Portal»_%282015%29.png/768px-Обложка_альбома_дуэта_AINA_«Portal»_%282015%29.png");
        songs.add(song12);

        Song song13 = new Song();
        song13.setName("Iron Man – Black Sabbath");
        song13.setFile("https://soundhelix.com/examples/mp3/SoundHelix-Song-13.mp3");
        song13.setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRqxjbYAV1_p8mQKq4z4I0L4qW0v4mwZwdRvQ&usqp=CAU");
        songs.add(song13);
        return songs;
    }
}
