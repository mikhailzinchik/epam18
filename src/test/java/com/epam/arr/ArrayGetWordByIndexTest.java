package com.epam.arr;

import org.junit.Test;

import static com.epam.arr.Array2.getWordByIndex;
import static org.junit.Assert.assertEquals;

public class ArrayGetWordByIndexTest {
    @Test
    public void testGetWordByIndex() {
        char[][] testArray = {"dog".toCharArray(), "cat".toCharArray(), "wolf".toCharArray()};
        assertEquals("cat", getWordByIndex(testArray, 2, 0, 1));
    }
}
