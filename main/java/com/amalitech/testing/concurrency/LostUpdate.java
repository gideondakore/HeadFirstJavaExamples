package com.amalitech.testing.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class LostUpdate {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(6);
        LostUpdateBalanceFix balance = new LostUpdateBalanceFix();
//        LostUpdateBalance balance = new LostUpdateBalance();
        for (int i = 0; i < 1000; i++) {
            pool.execute(balance::increment);
        }
        pool.shutdown();
        if (pool.awaitTermination(1, TimeUnit.MINUTES)) {
            System.out.println("balance = " + balance.bal);

        }

    }
}


