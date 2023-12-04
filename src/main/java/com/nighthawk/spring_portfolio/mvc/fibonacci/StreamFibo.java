package com.nighthawk.spring_portfolio.mvc.fibonacci;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFibo extends Fibo {
     public static ArrayList<Integer> findNth(int num) {
        if (num <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer");
        }

        return Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
                .limit(num)
                .map(fib -> fib[0])
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
