package com.amalitech.testing.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunThreads {

    public static void main(String[] args){

        try(ExecutorService executor = Executors.newFixedThreadPool(2);){
            executor.execute(() -> runJob("Job 1"));
            executor.execute(() -> runJob("Job 2"));
            executor.shutdown();
        }


    }

    public static void runJob(String jobName){
        for(int i = 0; i < 25; i++){
            String threadName = Thread.currentThread().getName();
            IO.println(jobName + " is running on " + threadName);
        }
    }
}
