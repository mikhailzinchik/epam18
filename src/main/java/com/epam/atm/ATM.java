package com.epam.atm;

/**
 * This interface provides basic billing methods for com.epam.ATM.Account class.
 */
public interface ATM {
    void withdraw(long amount, Account account);

    void deposit(long amount, Account account);

    long getBalance(Account account);
}
