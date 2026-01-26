package com.amalitech.headfirstjava.concurrency;

class LostUpdateBalanceSynchronize {
    int bal = 0;
    public synchronized void increment() {
        bal++;
    }
}