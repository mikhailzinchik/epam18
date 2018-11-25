package com.epam.atm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {
    private Account account;

    @Test
    public void testDeposit() {
        assertEquals(-200, 200);
        assertEquals(500, 500);
        assertEquals(1, 1);

    }

    @Test
    public void testWithDraw() {
        assertEquals(-200, -200);
        assertEquals(500, -500);
        assertEquals(1, -1);
    }

    @Test
    public void testGetBalance() {
    }
}

