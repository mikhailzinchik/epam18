package com.epam.atm;

/**
 * It provides methods to deposit and withdraw the balance.
 */
public class Account {

    public static final Account account = new Account();
    private long balance = 0;

    private Account() {
    }

    synchronized public void withdraw(long amount) {
        if (amount < 0) {
            throw new RuntimeException("Wrong amount. Please, input amount more then 0");
        }
        if (account.getBalance() - amount < 0) {
            throw new RuntimeException("Wrong amount. Please, input amount more then 0");
        }

        balance -= amount;
        System.out.println("Thread  " + Thread.currentThread().getId() + "" + " withdraw 200 and our balance " + balance);
    }

    synchronized public void deposit(long amount) {
        if (amount < 0) {
            throw new RuntimeException("Wrong amount. Please, input amount more then 0");
        }
        balance += amount;
        System.out.println("Thread  " + Thread.currentThread().getId() + "" + " deposit 3000 and our balance " + balance);
    }

    public synchronized long getBalance() {
        return balance;
    }
}
