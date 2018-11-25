package com.epam.recursion;

/**
 * Write recursion function for a^n (n native number)
 */
public class Exponentiation {
    public double power(double a, int n) {
        if (n > 0) {
            return a * power(a, n - 1);
        }
        if (n < 0) {
            return 1.0 / power(a, -n);
        }
        return 1; // if b == 0
    }
}
