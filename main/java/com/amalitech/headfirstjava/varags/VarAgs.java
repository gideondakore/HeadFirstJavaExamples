package com.amalitech.headfirstjava.varags;

public class VarAgs {

    public static void main(String... args){
        new VarAgs().printAllObjects((Object[])args);
        new VarAgs().printAllObjects2(args);

    }

//    public static void main(String[] args){
//        new VarAgs().printAllObjects((Object[])args);
//        new VarAgs().printAllObjects2(args);
//
//    }

    public void printAllObjects(Object... elements){
        for(Object element: elements){
            IO.println(element);
        }

        IO.println("\n=============================================================\n");
    }

    public void printAllObjects2(Object[] elements){
        for(Object element: elements){
            IO.println(element);
        }

        IO.println("\n=============================================================\n");

    }
}
