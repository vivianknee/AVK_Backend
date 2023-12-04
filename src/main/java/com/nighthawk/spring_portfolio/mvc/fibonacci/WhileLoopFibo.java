package com.nighthawk.spring_portfolio.mvc.fibonacci;

import java.util.ArrayList;

public class WhileLoopFibo extends Fibo {
    public static ArrayList<Integer> findNth(int num) {
        if (num <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer");
        }

        ArrayList<Integer> fibonacciList = new ArrayList<>();
        fibonacciList.add(0);
        fibonacciList.add(1);

        int i = 2;
        while (i <= num) {
            int fib = fibonacciList.get(i - 1) + fibonacciList.get(i - 2);
            fibonacciList.add(fib);
            i++;
        }

        return fibonacciList;
    }
}
    

