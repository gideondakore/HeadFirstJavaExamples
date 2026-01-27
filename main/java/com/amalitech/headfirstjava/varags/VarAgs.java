package com.amalitech.headfirstjava.varags;

public class VarAgs {

    public static void main(String[] args){
//        new VarAgs().printAllObjects((Object[])args);
        new VarAgs().printAllObjects2((Object[])args);

    }

    public void printAllObjects(Object... elements){
        for(Object element: elements){
            IO.println(element);
        }
    }

    public void printAllObjects2(Object[] elements){
        for(Object element: elements){
            IO.println(element);
        }
    }
}
