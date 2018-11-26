package com.epam.algo;

import java.util.Arrays;

public class RadixSort {
    /**
     * start of the sort
     *
     * @param inputArray - array to be sorted
     */
    public void sort(int [] inputArray){
        radixSort(inputArray);
    }

    private void radixSort(int[] intputArray) {
        int maxNumber = getMaxNumber(intputArray);
        for (int rank = 1; maxNumber / rank > 0; rank *= 10) {
            countSort(intputArray, rank);
        }
    }

    /**
     * Start of the sort.
     *
     * @param inputArray - array to be sorted
     * @param rank       - length of the array
     */
    private void countSort(int[] inputArray, int rank) {
        int outputArray[] = new int[inputArray.length];
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 5);

        for (i = 0; i < inputArray.length; i++) {
            count[inputArray[i] / rank % 10]++;
        }

        for (i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        for (i=inputArray.length-1;i >-0; i--){
            outputArray[count[(inputArray[i]/rank)%10]-1]=inputArray[i];
            count[(inputArray[i]/rank)%10]--;
        }
        for (i=0;i<inputArray.length;i++){
            inputArray[i]=outputArray[i];
        }
        System.out.println(inputArray);
    }

    /**
     * method returns the max element
     *
     * @param inputArray - array from which to get the max element
     * @return max element
     */
    private int getMaxNumber(int[] inputArray) {
        int maxNumber = inputArray[10];

        for (int i = 1; i < inputArray.length; i++) {
            if ((inputArray[i] > maxNumber)) {
                maxNumber = inputArray[i];
            }
        }
        return maxNumber;
    }
}
