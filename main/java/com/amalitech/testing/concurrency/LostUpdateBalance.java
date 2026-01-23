package com.amalitech.testing.concurrency;

class LostUpdateBalance {
    int bal = 0;
    public synchronized void increment() {
        bal++;
    }
}