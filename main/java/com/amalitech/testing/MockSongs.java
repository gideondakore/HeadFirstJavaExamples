package com.amalitech.testing;

import java.util.ArrayList;
import java.util.List;

public class MockSongs {


    public static List<String> getSongString(){

        List<String> songs = new ArrayList<>();
        songs.add("somersault");
        songs.add("cassidy");
        songs.add("$10");
        songs.add("havana");
        songs.add("50 ways");

        return songs;

    }

    public static List<Songv2> getSongsV2(){
        List<Songv2> songs = new ArrayList<>();
        songs.add(new Songv2("somersault", "zero 7", 147));
        songs.add(new Songv2("cassidy", "grateful dead", 158));
        songs.add(new Songv2("$10", "hitchicker", 140));

        songs.add(new Songv2("havana", "cabello", 105));
        songs.add(new Songv2("Cassidy", "grateful dead", 158));
        songs.add(new Songv2("50 ways", "simon", 102));
        return songs;
    }

    public static List<Songv3> getSongsV3(){
        List<Songv3> songs = new ArrayList<>();
        songs.add(new Songv3("somersault", "zero 7", 147));
        songs.add(new Songv3("cassidy", "grateful dead", 158));
        songs.add(new Songv3("$10", "hitchicker", 140));

        songs.add(new Songv3("havana", "cabello", 105));
        songs.add(new Songv3("Cassidy", "grateful dead", 158));
        songs.add(new Songv3("50 ways", "simon", 102));
        return songs;
    }

    // Factory generic method
//    public static <T> MockSongs<T> createMockSongs() {
//        return new MockSongs<T>();
//    }
}
