package com.amalitech.testing.concurrency;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTestDrive {

    public static void main(String[] args){


        try(ExecutorService executor = Executors.newSingleThreadExecutor();){

            executor.submit(() -> IO.println("Top  o' the stack"));
            IO.println("back in main");

            executor.shutdown();
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
