package com.epam.recursion;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {
    @Test
    public void testFactorial() {
        Factorial fact = new Factorial();
        assertEquals(1, fact.fact(0));
        assertEquals(6, fact.fact(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorial_throws() {
        Factorial fact = new Factorial();
        fact.fact(-1);
    }
}
