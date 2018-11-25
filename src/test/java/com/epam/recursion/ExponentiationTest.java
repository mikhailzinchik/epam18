package com.epam.recursion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExponentiationTest {
    @Test
    public void testPower() {
        Exponentiation exp =new Exponentiation();
        assertEquals(25, exp.power(5, 2), 10E-10);
        assertEquals(6.25, exp.power(2.5, 2), 10E-10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPower_throws() {
        Exponentiation exp =new Exponentiation();
        exp.power(3, -1);
    }

}
