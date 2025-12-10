package com.amalitech.testing;

import java.util.Comparator;
import java.util.List;

public class Jukebox5 {
    public static  void main(String[] args){
        new Jukebox5().go();
    }

    public void go(){
        List<Songv3> songv3List = MockSongs.getSongsV3();

//        ArtistCompare artistCompare = new ArtistCompare();
//        songv3List.sort(artistCompare);

        songv3List.sort(Comparator.comparing(Songv3::getTittle));


        songv3List.sort((s1, s2) -> s1.getTittle().compareTo(s2.getTittle()));

//        songv3List.sort(new Comparator<Songv3>() {
//            @Override
//            public int compare(Songv3 s1, Songv3 s2){
//                return s1.getTittle().compareTo(s2.getTittle());
//            }
//        });

        IO.println(songv3List);

    }
}
