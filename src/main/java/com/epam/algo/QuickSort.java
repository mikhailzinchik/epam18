package com.epam.algo;

public class QuickSort {
    public void sort(int[] array, int startIndex, int endIndex) {
        int pivotValue = getPivot(array, startIndex, endIndex);
        int currentStartIndex = startIndex - 1;
        int currentEndIndex = endIndex + 1;

        while (currentStartIndex < currentEndIndex) {
            do {
                currentStartIndex++;
            } while (array[currentStartIndex] < pivotValue);
            do {
                currentEndIndex--;
            } while (array[currentEndIndex] > pivotValue);

            if (currentStartIndex < currentEndIndex) {
                int buffer = array[currentStartIndex];
                array[currentStartIndex] = array[currentEndIndex];
                array[currentEndIndex] = buffer;
            }
        }
        currentStartIndex--;
        if ((currentStartIndex > startIndex)
                && (currentStartIndex - startIndex > 1))
            sort(array, startIndex, currentStartIndex);
        currentEndIndex++;
        if ((endIndex > currentEndIndex)
                && (endIndex - currentEndIndex > 1))
            sort(array, currentEndIndex, endIndex);
    }

    private int getPivot(int[] array, int startIndex, int endIndex) {
        return array[endIndex - 1];
    }
}
