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
        IO.println("SELECTED MEMBER: " + selectedBandMember);
    }
}
