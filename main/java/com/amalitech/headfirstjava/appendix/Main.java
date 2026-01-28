package com.amalitech.headfirstjava.appendix;

import java.util.Arrays;

public class Main {
    public static void main(String... args){
        EnumClass member = EnumClass.valueOf("JOHN");
        IO.println("MEMBER FULL NAME: " + member.getFullName());
        IO.println("MEMBER FULL INSTRUMENT NAME: " + member.getInstrument());
        IO.println("MEMBERS: " + Arrays.toString(EnumClass.values()));

        IO.print("\n");
        for(EnumClass mem: EnumClass.values()){
            IO.println("member: " + mem.getFullName() + ", plays " + mem.getInstrument() + " instrument");
        }
    }
}
