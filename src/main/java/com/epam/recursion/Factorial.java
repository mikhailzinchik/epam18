package com.epam.recursion;


public class Factorial {
    /**
     * Write recursion function for get factorial native number n
     */
    public static int fact(int n) {
        int result;

        if (n == 1) {
            return 1;
        }
        result = fact(n - 1) * n;
        return result;
    }
}
