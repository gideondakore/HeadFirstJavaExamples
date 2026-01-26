package com.amalitech.headfirstjava.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunThreads {

    public static void main(String[] args){

        try(ExecutorService threadPool = Executors.newFixedThreadPool(2);){
            threadPool.execute(() -> runJob("Job 1"));
            threadPool.execute(() -> runJob("Job 2"));
            threadPool.shutdown();
        }


    }

    public static void runJob(String jobName){
        for(int i = 0; i < 25; i++){
            String threadName = Thread.currentThread().getName();
            IO.println(jobName + " is running on " + threadName);
        }
    }
}
