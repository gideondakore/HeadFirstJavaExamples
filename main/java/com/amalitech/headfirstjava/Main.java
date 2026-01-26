package com.amalitech.headfirstjava;


public class Main {

    public static void  main(String[] args){
        String s = String.format("I have some %d bug", 1);
        String str = "I have %,d phones available".formatted(123465789);
        IO.println(s);
    }
}
