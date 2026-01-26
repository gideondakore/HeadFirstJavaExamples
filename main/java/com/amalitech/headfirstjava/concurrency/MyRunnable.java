package com.amalitech.headfirstjava.concurrency;

public class MyRunnable implements Runnable {

    public void run(){
        go();
    }

    public void go(){
        doMore();
    }

    public void doMore(){
        IO.println(Thread.currentThread().getName() + ": top o' stack");
        Thread.dumpStack();
    }

}
