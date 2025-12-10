package com.amalitech.testing;

import java.util.ArrayList;

public class Songv2 {
    private String title;
    private String artist;
    private int bpm;

    Songv2(String title, String artist, int bpm){
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }

    public int getBpm(){
        return bpm;
    }

    public String toAtring(){
        return title;
    }

    public static void genericLearning(ArrayList<MockSongs> mockSongs){
        IO.println("Testing generic");
    }

    public static <T> void genericLearningMethod(ArrayList<T> mockSongs){
        IO.println("Testing generic");
    }


}
