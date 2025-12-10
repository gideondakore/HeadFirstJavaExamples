package com.amalitech.testing;

import java.util.Comparator;

public class ArtistCompare implements Comparator<Songv3> {

    @Override
    public int compare(Songv3 s1, Songv3 s2) {
        IO.println("The Comparator class was used!");
        return s1.getArtist().compareTo(s2.getArtist());
    }
}
