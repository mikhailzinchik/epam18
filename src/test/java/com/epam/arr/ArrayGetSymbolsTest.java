package com.epam.arr;

import org.junit.Test;

import static com.epam.arr.Array.getSymbols;
import static org.junit.Assert.assertEquals;

public class ArrayGetSymbolsTest {
    @Test
    public void testGetSymbols() {
        char[][] testArray = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'}
        };
        assertEquals("acgi", getSymbols(testArray));
        testArray = new char[][]{
                "ab".toCharArray(),
                "cd".toCharArray()
        };
        assertEquals("abcd", getSymbols(testArray));
        testArray = new char[][]{
                "abc".toCharArray(),
                "d".toCharArray(),
                "efg".toCharArray()
        };
        assertEquals("aceg", getSymbols(testArray));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetCornerElements_oneDimArray() {
        getSymbols(new char[][]{"abc".toCharArray()});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetCornerElements_triangleArray() {
        getSymbols(new char[][]{
                "abc".toCharArray(),
                "c".toCharArray()
        });
    }
}
