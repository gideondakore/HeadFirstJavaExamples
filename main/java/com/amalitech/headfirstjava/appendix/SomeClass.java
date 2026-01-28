package com.amalitech.headfirstjava.appendix;

import java.util.Arrays;

public class SomeClass {
    public Member selectedBandMember;

    public static void main(String[] args){
        new SomeClass().someMethod();
    }

    public void someMethod(){
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
    }
}
