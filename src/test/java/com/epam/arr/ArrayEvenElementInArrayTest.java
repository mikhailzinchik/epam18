package com.epam.arr;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static com.epam.arr.Array4.evenElementsInArray;
import static junit.framework.TestCase.assertEquals;

public class ArrayEvenElementInArrayTest {
    @Test
    public void testEvenElementsInArray() {
        char[][] testArray = {"ABCD".toCharArray(), "EFGH".toCharArray()};
        ArrayList<String> expected = new ArrayList<String>(Arrays.asList("AC", "EG"));
        assertEquals(expected, evenElementsInArray(testArray));
    }
}
