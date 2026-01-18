package com.amalitech.testing.concurrency;

public class ThreadTestDrive {

    public static void main(String[] args){
        Thread thread = new Thread(() -> IO.println("Top o' stack"));
        thread.start();
        IO.println("back in main");
    }
}
