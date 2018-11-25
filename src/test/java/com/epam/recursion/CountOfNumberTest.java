package com.epam.recursion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountOfNumberTest {
    @Test
    public void testGetCountOfNumber() {
        CountOfNumber count= new CountOfNumber();
        assertEquals(4, count.getCountOfNumber(1000));
        assertEquals(2, count.getCountOfNumber(16));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetCountOfNumber_throws() {
        CountOfNumber count= new CountOfNumber();
        count.getCountOfNumber(-2);
    }
}
