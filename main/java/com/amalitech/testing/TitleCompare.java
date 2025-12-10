package com.amalitech.testing;

import java.util.Comparator;

public class TitleCompare implements Comparator<Songv3> {

    @Override
    public int compare(Songv3 s1, Songv3 s2){
        return s1.getTittle().compareTo(s2.getTittle());
    }
}
