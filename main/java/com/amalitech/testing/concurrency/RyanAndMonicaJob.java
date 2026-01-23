package com.amalitech.testing.concurrency;

public class RyanAndMonicaJob implements Runnable {
    private final String name;
    private final Account account;
    private final int amountToSpend;

    RyanAndMonicaJob(String name, Account acc, int amountToSpend) {
        this.name = name;
        this.account = acc;
        this.amountToSpend = amountToSpend;
    }


    public void run() {
        goShopping(amountToSpend);
    }


    private void goShopping(int amount) {
        System.out.println(name + " is about to spend");
        account.spend(name, amount);
    }

}
