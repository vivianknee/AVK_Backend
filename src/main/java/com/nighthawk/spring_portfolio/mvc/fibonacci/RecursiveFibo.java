package com.nighthawk.spring_portfolio.mvc.fibonacci;

import java.util.ArrayList;

public class RecursiveFibo extends Fibo {
    public static ArrayList<Integer> findNth(int num) {
        if (num <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer");
        }

        ArrayList<Integer> fibonacciList = new ArrayList<>();
        findNthRecursive(num, fibonacciList);

        return fibonacciList;
    }

    private static void findNthRecursive(int num, ArrayList<Integer> fibonacciList) {
        if (num >= fibonacciList.size()) {
            int fib = fibonacciList.get(fibonacciList.size() - 1) + fibonacciList.get(fibonacciList.size() - 2);
            fibonacciList.add(fib);
            findNthRecursive(num, fibonacciList);
        }
    }
}