package com.epam.lambda;

/**
 * Task #6 Lambda
 * Create a functional interface and use it with lambda expression.
 * @author Mikhail Zinchik
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.getlambda(() -> System.out.println("Let`s call my cat is Barsik "));
    }

    private void getlambda(Cat cat) {
        cat.getName();
    }
}
