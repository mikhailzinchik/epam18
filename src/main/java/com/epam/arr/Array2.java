package com.epam.arr;

import java.util.Arrays;

/**
 * 12.271 Print a string formed by the characters of a single line, starting with the character startIndex, ending endIndex.
 */
public  class Array2 {
    public static String getWordByIndex(char[][] array, int row, int startIndex, int endIndex) {
        if ((row < 0) || (startIndex < 0) || (endIndex < 0)) {
            throw new IllegalArgumentException("Indexes must be more than 0.");
        }
        if (row >= array.length) {
            throw new ArrayIndexOutOfBoundsException("row must be less than array.length.");
        }
        if (endIndex >= array[row].length) {
            throw new ArrayIndexOutOfBoundsException("'endIndex' must be less than array[row].length.");
        }
        return new String(Arrays.copyOfRange(array[row], startIndex, endIndex + 1));
    }
}