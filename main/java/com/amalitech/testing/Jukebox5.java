package com.amalitech.testing;

import java.util.*;

public class Jukebox5 {
    public static  void main(String[] args){
        new Jukebox5().go();
    }

    public void go(){
        List<Songv3> songv3List = MockSongs.getSongsV3();
//        songv3List.sort(Comparator.comparing(Songv3::getTittle));
        IO.println("Before Set: " + songv3List);

        // Hashset
//        Set<Songv3> setList = new HashSet<>(songv3List);

        // TreeSet Method 1
//        Set<Songv3> treeSet = new TreeSet<>(songv3List);

        // TreeSet Method 2
        Set<Songv3> treeSetComp = new TreeSet<>((ob1, ob2) -> ob1.getBpm() - ob2.getBpm());
        treeSetComp.addAll(songv3List);
        IO.println("After Set: " + treeSetComp);

//        ArtistCompare artistCompare = new ArtistCompare();

        //Method 1
//        songv3List.sort(artistCompare);

        //Method 2
//        songv3List.sort(Comparator.comparing(Songv3::getBpm));

        //Method 3
//        songv3List.sort((s1, s2) -> s1.getTittle().compareTo(s2.getTittle()));

        //Method 4
//        songv3List.sort(new Comparator<Songv3>() {
//            @Override
//            public int compare(Songv3 s1, Songv3 s2){
//                return s1.getTittle().compareTo(s2.getTittle());
//            }
//        });


//        IO.println(songv3List);

    }
}
