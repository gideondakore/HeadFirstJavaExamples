package com.amalitech.testing.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ClosingTime {

    public static void main(String[] args){
        try(ExecutorService threadPool = Executors.newFixedThreadPool(2);){
            threadPool.execute(new LongJob("Long Job 1"));
            threadPool.execute(new ShortJob("Short Job 1"));

            threadPool.shutdown();

            try{
                boolean isFinished = threadPool.awaitTermination(5, TimeUnit.SECONDS);
                IO.println("Finished? " + isFinished);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
            threadPool.shutdownNow();
        }

    }

    public static class LongJob implements Runnable{
       private final String job;

       public LongJob(String name){
           this.job = name;
       }

       public void run(){
          sleepMethod();
       }

       public void sleepMethod(){
           try{
               TimeUnit.SECONDS.sleep(60);
           } catch (InterruptedException e) {
               Thread.currentThread().interrupt();
           }

           IO.println("top o’ the stack: " + Thread.currentThread().getName() + " " + job);
       }
    }

    public record ShortJob(String name) implements Runnable {
            public void run() {
                IO.println("Top o' the stack: " + Thread.currentThread().getName() + " " + name);
            }
    }
}
