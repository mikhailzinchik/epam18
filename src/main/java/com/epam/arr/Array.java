package com.epam.arr;

public class Array {
    /**
     *Print a string formed by characters located in the four corners of the array (in any order)
     */
    public static String getSymbols(char[][] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Must be more than 2 rows");
        }
        if (array[array.length-1].length < 2) {
            throw new IllegalArgumentException("Must be more than 2 rows");
        }
        return "" + array[0][0] + array[0][array[0].length-1]
                + array[array.length-1][0]
                + array[array.length-1][array[array.length-1].length-1];
    }
}
