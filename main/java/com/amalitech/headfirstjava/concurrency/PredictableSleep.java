package com.amalitech.headfirstjava.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PredictableSleep {

    public static void main(String[] args){

        try(ExecutorService executor = Executors.newSingleThreadExecutor();){
            executor.execute(PredictableSleep::sleepThenPrint);
            IO.println("back in main");
            executor.shutdown();
        }
    }

    public static void sleepThenPrint(){
        try{
            TimeUnit.SECONDS.sleep(2);
        }catch(InterruptedException ex){
            Thread.currentThread().interrupt();
            ex.printStackTrace();

            return;
        }
        IO.println("top o’ the stack");
    }
}
