package com.epam.atm;

public interface ATM {
    /**
     * This interface provides basic billing methods for com.epam.ATM.Account class.
     */
    void withdraw(long amount, Account account);

    void deposit(long amount, Account account);

    long getBalance(Account account);
}
