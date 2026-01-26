package com.amalitech.headfirstjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Jukebox2 {
    public static void main(String[] args){
        Jukebox2.go();
    }

    public static void go(){
        List<Songv3> songList = MockSongs.getSongsV3();
        IO.println("Before Sort: " + songList);

        ArrayList<MockSongs> mockSongs = new ArrayList<>();
        ArrayList<MockSong1> mockSong1s = new ArrayList<>();
        ArrayList<MockSong2> mockSong2s = new ArrayList<>();

//        Songv2.genericLearning(mockSongs);
        Songv2.genericLearningMethod(mockSong2s);

        Collections.sort(songList);

        IO.println("After Sort: " + songList);
    }
}
