package com.amalitech.headfirstjava.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTestDrive {

    public static void main(String[] args){


        try(ExecutorService executor = Executors.newSingleThreadExecutor();){

            executor.execute(() -> IO.println("Top  o' the stack")); // Use execute() when you just want to run a task and don't care about the result or completion status: UncaughtExceptionHandler
//            executor.submit(() -> IO.println("Top  o' the stack")); // Use submit() when you need the result, want to handle exceptions, or need to check/control task execution : Can catch via Future.get()
            IO.println("back in main");

            executor.shutdown();
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
