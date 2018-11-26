package com.epam.atm;

public class SimpleATM implements ATM {
    /**
     *
     * @param amount - our amount in ATM
     * @param account- our account
     */
    public void withdraw(long amount, Account account) {
        account.withdraw(amount);
    }

    /**
     *
     * @param amount-our amount in ATM
     * @param account - our account
     */
    public void deposit(long amount, Account account) {
        account.deposit(amount);
    }

    /**
     *
     * @param account- our account
     * @return getBalance
     */
    public long getBalance(Account account) {
        return account.getBalance();
    }
}
