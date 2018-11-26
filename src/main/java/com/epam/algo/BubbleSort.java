package com.epam.algo;

public class BubbleSort {
    /**
     * start of the sort
     *
     * @param inputArray - array to be sorted
     */
    public void sort(int[] inputArray) {
        int swapElements = 0;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 1; j < (inputArray.length - i); j++) {
                if (inputArray[j - 1] > inputArray[j]) {
                    swapElements = inputArray[j - 1];
                    inputArray[j - 1] = inputArray[j];
                    inputArray[j] = swapElements;
                }
            }
        }
    }
}
