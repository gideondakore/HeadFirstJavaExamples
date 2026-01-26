package com.amalitech.headfirstjava.concurrency;

public class LostUpdateBalance {

    int bal = 0;
    public void increment() {
        bal++;
    }
}
