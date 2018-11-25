package com.epam.algo;

import java.util.Arrays;
import java.util.Scanner;

public class StartProgram {
    public StartProgram() {
        chooseAlgorithm(inputNumber());
    }

    /**
     * Choosing number of algorithm for run
     *
     * @return number
     */
    public int inputNumber() {
        int number = 0;
        boolean isCorrectNumber = false;
        while (!isCorrectNumber) {
            System.out.println("Please, choose program: ");
            System.out.println("1. Let`s run bubble sort");
            System.out.println("2. Let`s run radix sort");
            System.out.println("3. Let`s run merge sort");
            System.out.println("4. Let`s run quick sort");
            System.out.println("5. Let`s run binary search");
            try {
                number = Integer.parseInt(readLine());
            } catch (NumberFormatException e) {
                System.err.println("Wrong choose, try again later");
            }
            if (number > 0 && 6 > number) {
                isCorrectNumber = true;
            }
        }
        return number;
    }

    /**
     * Reading a line
     *
     * @return String
     */
    public String readLine() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    /**
     * Choosing one of algorithm
     *
     * @param number
     */
    public void chooseAlgorithm(int number) {
        switch (number) {
            case 1:
                DoBubbleSort();
                break;
            case 2:
                DoRadixSort();
                break;
            case 3:
                DoMergeSort();
                break;
            case 4:
                DoQuickSort();
                break;
            case 5:
                DoBinarySearch();
                break;
            default:
                break;
        }
    }

    /**
     * run radix sort
     */
    public void DoRadixSort() {
        int[] arr = {15, 24, 110, 34, 1, 79};
        System.out.println("arr before sort: " + Arrays.toString(arr));
        RadixSort radixSort = new RadixSort();
        radixSort.sort(arr);
        System.out.println("arr after sort: " + Arrays.toString(arr));
    }

    /**
     * run quick sort
     */
    public void DoQuickSort() {
        int[] arr = {15, 24, 110, 34, 1, 79};
        System.out.println("arr before sort: " + Arrays.toString(arr));
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr, 0, arr.length - 1);
        System.out.println("arr after sort: " + Arrays.toString(arr));
    }

    /**
     * run merge sort
     */
    public void DoMergeSort() {
        int[] arr = {15, 24, 110, 34, 1, 79};
        System.out.println("arr before sort: " + Arrays.toString(arr));
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr);
        System.out.println("arr after sort: " + Arrays.toString(arr));
    }

    /**
     * run binary search
     */
    public void DoBinarySearch() {
        int[] arr = {11, 224, 7, 110, 15, 349};
        boolean isNumber = false;
        int element = 0;
        System.out.println("arr: " + Arrays.toString(arr));
        while (!isNumber) {
            System.out.println("Input element: ");
            try {
                element = Integer.parseInt(readLine());
                isNumber = true;
            } catch (NumberFormatException e) {
                System.err.println("Wrong element");
            }
        }
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.search(element, arr));
    }

    /**
     * run bubble sort
     */
    public void DoBubbleSort() {
        int[] arr = {15, 24, 110, 34, 1, 79};
        System.out.println("arr before sort: " + Arrays.toString(arr));
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        System.out.println("arr after sort: " + Arrays.toString(arr));
    }
}
