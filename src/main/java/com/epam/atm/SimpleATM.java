package com.epam.atm;

public class SimpleATM implements ATM {
    public void withdraw(long amount, Account account) {
        account.withdraw(amount);
    }

    public void deposit(long amount, Account account) {
        account.deposit(amount);
    }

    public long getBalance(Account account) {
        return account.getBalance();
    }
}
