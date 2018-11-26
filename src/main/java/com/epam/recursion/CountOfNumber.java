package com.epam.recursion;

public class CountOfNumber {
    /**
     * Write recursion function for get count of number
     */
    public int getCountOfNumber(int n)
    {
        return (n / 10 != 0) ? 1 + getCountOfNumber(n / 10) : 1;
    }
}
