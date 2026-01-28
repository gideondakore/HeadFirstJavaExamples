package com.amalitech.headfirstjava.appendix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        IO.println("BEFORE: " + Arrays.toString(EnumClass.values()));
        IO.println("BEFORE: " + Arrays.toString(EnumClass.enumValues()));



        EnumClass john = EnumClass.getJohn();
        john = EnumClass.PAUL;

        IO.println("EXPECTING PAUL: " + john);
        IO.println("AFTER" + Arrays.toString(EnumClass.enumValues()));


        EnumClass[] members = EnumClass.enumValues();
        members[0] = null;
        IO.println(Arrays.toString(EnumClass.enumValues()));

        EnumClass[] members2 = EnumClass.enumValues();
        IO.println(members2[0]);

        List<EnumClass> membersList = new ArrayList<>(EnumClass.listValues());
        membersList.set(0, null);
        IO.println(Arrays.toString(EnumClass.enumValues()));

        List<EnumClass> members2List =new ArrayList<>(EnumClass.listValues());
        IO.println(members2List.getFirst());

    }
}
