package com.epam.atm;

public class ATMSession extends Thread {
    /**
     * We put and remove a certain amount of money from the account
     */
    @Override
    public void run() {
        ATM atm = new SimpleATM();
        for (int i = 0; i < 1000000; i++) {
            atm.deposit(3000, Account.account);
            atm.withdraw(200, Account.account);
        }
    }
}
