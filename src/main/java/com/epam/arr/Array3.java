package com.epam.arr;

public class Array3 {
    /**
     *12.271. Task a. from left to right in each line starting from the first
     */
    public static StringBuilder printWordOne(char[][] array) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    str.append(array[i][j]);
                } else if (i % 2 == 1 && j % 2 == 1) {
                    str.append(array[i][j]);
                }
            }
        }
        return str;
    }

    /**
     *12.272.Task b. top to bottom in each column starting from the first
     */
    public static StringBuilder printWordTwo(char[][] array) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    str.append(array[j][i]);
                } else if (i % 2 == 1 && j % 2 == 1) {
                    str.append(array[j][i]);
                }
            }
        }
        return str;
    }
}