package com.epam.algo;

public class MergeSort {

    private int[] inputArray;
    private int[] helperArray;

    public void sort(int[] inputArray) {
        this.inputArray = inputArray;
        this.helperArray = new int[inputArray.length];
        mergeSort(0, inputArray.length - 1);
    }

    /**
     * start of the sort
     *
     * @param lowerBoundary  of the array
     * @param higherBoundary of the array
     */
    private void mergeSort(int lowerBoundary, int higherBoundary) {
        if (lowerBoundary < higherBoundary) {
            int middleBoundary = lowerBoundary + (higherBoundary - lowerBoundary) / 2;
            mergeSort(lowerBoundary, middleBoundary);
            mergeSort(middleBoundary + 1, higherBoundary);
            merge(lowerBoundary, middleBoundary, higherBoundary);
        }
    }

    /**
     * merge method to merge sorted arrays
     *
     * @param lowerBoundary  of the merge array 1
     * @param middleBoundary end of the merge array 1 and middle + 1 - start of the merge array 2
     * @param highBoundary   - end of the merge array 2
     */
    private void merge(int lowerBoundary, int middleBoundary, int highBoundary) {
        for (int i = lowerBoundary; i <= highBoundary; i++) {
            this.helperArray[i] = this.inputArray[i];
        }

        int i = lowerBoundary;
        int j = middleBoundary + 1;
        int k = lowerBoundary;

        while (i <= middleBoundary && j <= highBoundary) {
            if (this.helperArray[i] <= this.helperArray[j]) {
                this.inputArray[k] = this.helperArray[i];
                i++;
            } else {
                this.inputArray[k] = this.helperArray[j];
                j++;
            }
            k++;
        }

        while (i <= middleBoundary) {
            this.inputArray[k] = this.helperArray[i];
            k++;
            i++;
        }
    }
}
