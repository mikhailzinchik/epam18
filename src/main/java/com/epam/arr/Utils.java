package com.epam.arr;

import java.util.Scanner;

public class Utils {
    /**
     *Helper methods that read characters from the console and check for parity
     */
    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}