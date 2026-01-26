package com.amalitech.headfirstjava.concurrency;
import java.util.concurrent.atomic.AtomicInteger;

class LostUpdateBalanceAtomicBalance {
    AtomicInteger bal = new AtomicInteger(0);
    public void increment() {
        bal.incrementAndGet();
    }
}
