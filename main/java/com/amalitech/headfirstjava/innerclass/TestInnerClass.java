package com.amalitech.headfirstjava.innerclass;

public class TestInnerClass {

    public static void main(String[] args){

        MyOuterClass.MyInnerClass innerClass = new MyOuterClass().new MyInnerClass(3);
        IO.println("VALUE OF X IN INNER CLASS: " + innerClass.getX());
    }
}
