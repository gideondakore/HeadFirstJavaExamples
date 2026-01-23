package com.amalitech.testing.concurrency;

class BankAccount implements Account{

    private int balance = 100;
    public int getBalance() {
        return balance;
    }
    @Override
    public synchronized void spend(String name, int amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println(name + " transaction completed successfully!");
            if (balance < 0) {
                System.out.println("Overdrawn!");
            }
        } else {
            System.out.println("Sorry, not enough for " + name + ". Current Balance: " + this.getBalance());
        }
    }
}
