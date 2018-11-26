package com.epam.arr;

public class Array4 {
    /**
     *12.273 Type the words formed by the even elements of each line of the array.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static StringBuilder evenElementsInArray(char[][] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (Utils.isEven(i + 1) && Utils.isEven(j + 1)) {
                    stringBuilder.append(array[i][j]);
                }
            }
            stringBuilder.append(" ");
        }
        return stringBuilder;
    }
}