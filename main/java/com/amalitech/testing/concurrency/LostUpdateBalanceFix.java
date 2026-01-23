package com.amalitech.testing.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

class LostUpdateBalanceFix {
    AtomicInteger bal = new AtomicInteger(0);
    public void increment() {
        bal.incrementAndGet();
    }
}