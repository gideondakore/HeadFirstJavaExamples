package com.amalitech.headfirstjava.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class BankAccountAtomicOperation implements Account {

    private AtomicInteger balance = new AtomicInteger(100);
    public int getBalance() {
        return balance.get();
    }

    public void spend(String name, int amount) {
        int currentBalance;
        int newBalance;
       do{

           currentBalance = balance.get();
           newBalance = currentBalance - amount;

           if(newBalance < 0){
               System.out.println("Sorry, not enough for " + name + ". Current Balance: " + currentBalance);
               return;
           }

       }while (!balance.compareAndSet(currentBalance, newBalance));

        System.out.println(name + " transaction completed successfully!");
        System.out.println("Transaction successful! Current balance: " + balance.get());
    }

}
