package com.amalitech.testing.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTester {

    public static void main(String[] args){

        Runnable job = new MyRunnable();

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(job);

        IO.println(Thread.currentThread().getName() + ": back in main");
        Thread.dumpStack();
        executor.shutdown();
    }
}
