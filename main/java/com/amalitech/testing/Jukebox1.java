package com.amalitech.testing;

import java.util.Collections;
import java.util.List;

public class Jukebox1 {

    public static void main(String[] args){
        new Jukebox1().go();
        Jukebox1.tt();
    }

    public void go(){
        List<String> songList = MockSongs.getSongString();
        IO.println(songList);
        Collections.sort(songList);
        IO.println(songList);
    }

    public static void tt(){
        char c = 36;
        IO.println("Character: " + c);
    }

}
