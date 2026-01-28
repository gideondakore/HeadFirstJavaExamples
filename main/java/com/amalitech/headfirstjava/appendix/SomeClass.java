package com.amalitech.headfirstjava.appendix;

import java.util.Arrays;

public class SomeClass {
    public Member selectedBandMember;
//    var var = 10; // ERROR
    int var = 20; // Excellento Perfecto

    public static void main(String[] args){
        IO.println("var is not a keyword in Java. It's a reserved type name (also called a context-sensitive keyword or restricted identifier).");
        IO.println("var value: " + new SomeClass().var);
        new SomeClass().someMethod();
    }

    public void someMethod(){
        var var = 10;
        var someStr = "String";
        someStr = "Another String";

        var wrong = 2;
//        wrong = "wrong"; // Error

        IO.println("VAR VALUE: " + var);
        IO.println("SOME STRING: " + someStr);

        selectedBandMember = Member.KEVIN;
        if(selectedBandMember == Member.KEVIN){
            IO.println("MEMBER: " + Arrays.toString(Member.values()));
        }
        // instanceof checks inheritance; class comparison does not
        Object obj = selectedBandMember;
        String member = selectedBandMember.name();
        IO.println("GET STRING VALUE OF MEMBER ENUM: " + (member instanceof String));
        boolean isString = obj instanceof String;
        IO.println("SELECTED MEMBER: " + selectedBandMember);
        IO.println("INSTANCE OF STRING: " + isString);
        IO.println("INSTANCE OF ENUM MEMBER TYPE: " + selectedBandMember.getClass().isEnum());
        IO.println("INSTANCE OF TYPE: " + selectedBandMember.getClass().getName());
        IO.println("INSTANCE OF SIMPLIFY TYPE: " + selectedBandMember.getClass().getSimpleName());


        Member mem = Member.BOB;
        if(mem.equals(Member.KEVIN))
            IO.println("Bellloooo!");
        if(mem == Member.BOB)
            IO.println("Poochy");

        switch (mem){
            case KEVIN -> IO.println("Uh... la cucaracha?");
            case BOB -> IO.println("King Bob");
            case STUART -> IO.println("Banana!");
        }

    }
}
