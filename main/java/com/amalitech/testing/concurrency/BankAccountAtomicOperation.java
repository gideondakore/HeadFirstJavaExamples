package com.amalitech.testing.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class BankAccountAtomicOperation implements Account {

    private AtomicInteger balance = new AtomicInteger(100);
    public AtomicInteger getBalance() {
        return balance;
    }

    public void spend(String name, int amount) {

        boolean success = balance.compareAndSet(getBalance().intValue(), getBalance().intValue() - amount);

        if(success){
            System.out.println(name + " transaction completed successfully!");
            System.out.println("Transaction successful! Current balance: " + this.getBalance());
        }else{
            System.out.println("Sorry, not enough for " + name + ". Current Balance: " + this.getBalance());
        }

    }

}
