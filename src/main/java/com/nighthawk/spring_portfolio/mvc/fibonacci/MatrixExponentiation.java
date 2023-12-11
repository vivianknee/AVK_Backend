package com.nighthawk.spring_portfolio.mvc.fibonacci;

import java.util.ArrayList;

public class MatrixExponentiation extends Fibo {
    private static void multiply(int[][] a, int[][] b) {
        int x = a[0][0] * b[0][0] + a[0][1] * b[1][0];
        int y = a[0][0] * b[0][1] + a[0][1] * b[1][1];
        int z = a[1][0] * b[0][0] + a[1][1] * b[1][0];
        int w = a[1][0] * b[0][1] + a[1][1] * b[1][1];

        a[0][0] = x;
        a[0][1] = y;
        a[1][0] = z;
        a[1][1] = w;
    }

    private static void power(int[][] F, int n) {
        if (n <= 1)
            return;

        int M[][] = {{1, 1}, {1, 0}};

        power(F, n / 2);
        multiply(F, F);

        if (n % 2 != 0)
            multiply(F, M);
    }

    public static ArrayList<Integer> calculateFibonacci(int num) {
        if (num <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer");
        }

        ArrayList<Integer> fibonacciList = new ArrayList<>();

        if (num == 1) {
            fibonacciList.add(0);
        } else if (num >= 2) {
            int[][] F = {{1, 1}, {1, 0}};
            power(F, num - 1);

            int fib = F[0][0];
            fibonacciList.add(0);
            fibonacciList.add(1);

            for (int i = 2; i <= num; i++) {
                fibonacciList.add(fib);
                fib = F[0][0] + F[0][1];
                F[0][0] = F[0][1];
                F[0][1] = fib;
            }
        }

        return fibonacciList;
    }
}
