package com.epam.algo;

public class BinarySearch {
    public int search(int elementToFind, int[] array) {
        int firstBoundary = 0;
        int lastBoundary = array.length - 1;
        while (firstBoundary <= lastBoundary) {
            int middleBoundary = firstBoundary + (lastBoundary - firstBoundary) / 2;
            if (elementToFind < array[middleBoundary]) {
                lastBoundary = middleBoundary - 1;
            } else if (elementToFind > array[middleBoundary]) {
                firstBoundary = middleBoundary + 1;
            } else {
                return elementToFind;
            }
        }
        return-1;
    }
}
