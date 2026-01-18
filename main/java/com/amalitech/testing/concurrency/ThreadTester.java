package com.amalitech.testing.concurrency;

public class ThreadTester {

    public static void main(String[] args){
        MyRunnable threadJob = new MyRunnable();
        Thread thread = new Thread(threadJob);
        thread.start();

        IO.println(thread.currentThread().getName() + ": back in main");

        Thread.dumpStack();
    }
}
