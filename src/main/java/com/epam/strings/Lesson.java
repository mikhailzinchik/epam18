package com.epam.strings;

import java.util.Scanner;
/**
 * Task:
 * 9.13. Given the word. Display its third symbol on the screen.
 * 9.14. Given the word. display its last character.
 * 9.15. Given the word. Display its k-th symbol.
 * 9.64. Given the proposal. Determine how many identical letters there are in it.
 * 9.100. Given the word. Swap the second and fifth letters.
 * Print the offer in the console. Reverse letters.
 */
public class Lesson {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println("The 3rd character in the word:");
        System.out.println(printThirdSymbol(s));
        System.out.println("The last character in the word");
        System.out.println(printLastSymbol(s));
        System.out.println("k-th character in the word:");
        System.out.println(printSomeSymbol(s, 2));
        System.out.println(
                "Changed the 5th and 2nd character in places:");
        System.out.println(printAmount(s));
        System.out.println("Number of consecutive repeating letters:");
        System.out.println(printChangeWords(s));
        System.out.println("Word after reverse:");
        printReverse(s);
    }

    private static char printThirdSymbol(String in) {
        return in.charAt(2);
    }

    private static char printLastSymbol(String in) {
        return in.charAt(in.length() - 1);
    }

    private static char printSomeSymbol(String in, int k) {
        return in.charAt(k - 1);
    }

    private static int printAmount(String in) {
        int i = 0;
        for (int j = 0; j < in.length() - 1; j++) {
            if (in.substring(j, j + 1).equals(in.substring(j + 1, j + 2)))
                i++;
        }
        return i;
    }

    private static String printChangeWords(String in) {
        char second = in.charAt(1);
        char fives = in.charAt(4);
        String word = in.substring(0, 1) + fives + in.substring(2, 4) + second + in.substring(5);
        return word;
    }

    private static String printReverse(String in) {
        StringBuffer buffer = new StringBuffer(in);
        buffer.reverse();
        System.out.println();
        System.out.println(buffer);
        return in;
    }
}