package com.amalitech.testing.concurrency;

//NB: THIS DOES NOT DO WHAT WE WANTED

public class RunTester {

    public static void main(String[] args){

        MyRunnable myRunnable = new MyRunnable();
        myRunnable.run();

        IO.println(Thread.currentThread().getName() + ": back in main");
        Thread.dumpStack();
    }
}
