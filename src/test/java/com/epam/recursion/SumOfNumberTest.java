package com.epam.recursion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfNumberTest {
    @Test
    public void testGetSumOfNumber() {
        SumOfNumber sum= new SumOfNumber();
        assertEquals(1, sum.getSumOfNumber(100000));
        assertEquals(15, sum.getSumOfNumber(21354));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSumOfNumber_throws() {
        SumOfNumber sum= new SumOfNumber();
        sum.getSumOfNumber(-1);
    }
}
