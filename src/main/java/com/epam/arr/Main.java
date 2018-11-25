package com.epam.arr;

import static com.epam.arr.Array3.printWordOne;
import static com.epam.arr.Array3.printWordTwo;
import static com.epam.arr.Array4.evenElementsInArray;
import static com.epam.arr.Array5.getWordOdd;

/**
 * 12.270 Print a string formed by characters located in the four corners of the array (in any order)
 * 12.271 Create a program that prints the word formed by several consecutive characters
 * with given numbers located in a certain row of the array
 * 12.272 Given a two-dimensional array of size 5x5, filled with letters. Type
 * word formed by array elements marked with an asterisk :, while reading them:
 * a) from left to right in each row, starting with the first;
 * b) from top to bottom in each column, starting with the first.
 * |*| |*| |*|
 * | |*| |*| |
 * |*| |*| |*|
 * | |*| |*| |
 * |*| |*| |*|
 * 12.273 Type the words formed by the even elements of each line of the array.
 * 12.274 Type the words formed by the odd elements of each column in the array
 */
public class Main {
    static char [][] array={{'a','b','c','d','e'},
            {'f','g','h','i','j'},
            {'k','l','m','n','o'},
            {'p','q','r','s','t'},
            {'y','v','w','x','z'}};
    static int row;
    static int startIndex;
    static int endIndex;

    public static void main(String[] args) {
        System.out.println("A string formed by characters located in the four corners of the array:");
        System.out.println();
        System.out.println(Array.getSymbols(array));
        System.out.println("Word obtained by random consecutive characters in one line:");
        System.out.println();
        System.out.println(Array2.getWordByIndex(array,row,startIndex,endIndex));
        System.out.println("The word received by the shaded elements, if you go along the line:");
        System.out.println();
        System.out.println(printWordTwo(array));
        System.out.println("The word received by the shaded elements, if you go along the column:");
        System.out.println();
        System.out.println(printWordOne(array));
        System.out.println("Words formed by the even elements of each line of the array:");
        System.out.println();
        System.out.println(evenElementsInArray(array));
        System.out.println("Words formed by the odd elements of each column of the array:");
        System.out.println(getWordOdd(array));
    }
}