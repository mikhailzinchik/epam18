package com.epam.algo;

public class QuickSort {
    /**
     * start of the sort
     *
     * @param array      - array to be sorted
     * @param startIndex of the array
     * @param endIndex   of the array
     */
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

    /**
     * Getting pivot
     *
     * @param array      - array to be sorted
     * @param startIndex of the array
     * @param endIndex   of the array
     * @return takes last element as pivot, the last element in array
     */
    private int getPivot(int[] array, int startIndex, int endIndex) {
        return array[endIndex - 1];
    }
}
