package com.amalitech.testing;

import java.util.Collections;
import java.util.List;

public class Jukebox4 {

    public static void main(String[] args){
        new Jukebox4().go();
    }

    public void go() {
        List<Songv3> songList = MockSongs.getSongsV3();
        IO.println("Before Comaparable Comparator: " + songList);

        Collections.sort(songList);
        IO.println("After Comaparable: " + songList);

        ArtistCompare artistCompare = new ArtistCompare();
        // Method 1
//        songList.sort(artistCompare);
        // Method 2
//        Collections.sort(songList, artistCompare);
        // Method 2
        songList.sort(artistCompare);
        IO.println("After Comparator: " + songList);
    }
}
