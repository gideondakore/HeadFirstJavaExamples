package com.amalitech.headfirstjava.concurrency;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PredictableLatch {

    public static void main(String[] args){
        ExecutorService executor = Executors.newSingleThreadExecutor();
        CountDownLatch latch = new CountDownLatch(1);

        executor.execute(() -> waitForLatchThenPrint(latch));
        IO.println("back in main");
        latch.countDown();
        executor.shutdown();
    }

    public static void waitForLatchThenPrint(CountDownLatch latch){
        try{
            latch.await();
        }catch (InterruptedException ex){
            Thread.currentThread().interrupt();
            return;
//            ex.printStackTrace();
        }

        IO.println("top o’ the stack");
    }
}
