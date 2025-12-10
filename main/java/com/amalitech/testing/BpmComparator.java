package com.amalitech.testing;

import java.util.Comparator;

public class BpmComparator implements Comparator<Songv3> {

    @Override
    public int compare(Songv3 ob1, Songv3 ob2){
        return Integer.compare(ob1.getBpm(), ob2.getBpm());
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
