package com.nighthawk.spring_portfolio.mvc.fibonacci;

import java.util.ArrayList;

public class RecursiveFibonacci extends Fibo {
    public static ArrayList<Integer> calculateFibonacci(int num) {
        if (num <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer");
        }

        ArrayList<Integer> fibonacciList = new ArrayList<>();

        for (int i = 0; i <= num; i++) {
            fibonacciList.add(recursiveFibonacci(i));
        }

        return fibonacciList;
    }

    private static int recursiveFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }
}
