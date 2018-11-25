package com.epam.atm;

/**
 * Task #5 Thread-safe Automated Teller Machine
 *
 * @author Michael Zinchik
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ATM atm1 = new SimpleATM();
        ATMSession session1 = new ATMSession();
        ATMSession session2 = new ATMSession();
        ATMSession session3 = new ATMSession();
        ATMSession session4 = new ATMSession();
        session1.start();
        session2.start();
        session3.start();
        session4.start();
        Thread.sleep(200);
        System.out.println("Final balance in ATM is " + atm1.getBalance(Account.account));
    }
}
