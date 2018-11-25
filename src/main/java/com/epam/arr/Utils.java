package com.epam.arr;

import java.util.Scanner;

/**
 *Helper methods that read characters from the console and check for parity
 */
public class Utils {
    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}