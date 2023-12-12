package com.nighthawk.spring_portfolio.mvc.fibonacci;

import java.util.ArrayList;

public class IterativeFibonacci extends Fibo {
    public static ArrayList<Integer> calculateFibonacci(int num) {
        if (num <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer");
        }

        ArrayList<Integer> fibonacciList = new ArrayList<>();

        int a = 0, b = 1;
        fibonacciList.add(a);
        fibonacciList.add(b);

        for (int i = 2; i <= num; i++) {
            int next = a + b;
            fibonacciList.add(next);
            a = b;
            b = next;
        }

        return fibonacciList;
    }
}
