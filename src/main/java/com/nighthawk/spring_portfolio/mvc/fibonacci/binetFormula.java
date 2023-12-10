package com.nighthawk.spring_portfolio.mvc.fibonacci;

import java.util.ArrayList;

public class binetFormula extends Fibo {
    public static ArrayList<Integer> calculateFibonacci(int num) {
        if (num <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer");
        }

        ArrayList<Integer> fibonacciList = new ArrayList<>();
        double sqrt5 = Math.sqrt(5);
        double phi = (1 + sqrt5) / 2;

        for (int i = 0; i <= num; i++) {
            int fib = (int) Math.round((Math.pow(phi, i) - Math.pow(-phi, -i)) / sqrt5);
            fibonacciList.add(fib);
        }

        return fibonacciList;
    }
}
