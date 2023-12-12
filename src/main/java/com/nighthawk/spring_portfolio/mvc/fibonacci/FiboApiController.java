package com.nighthawk.spring_portfolio.mvc.fibonacci;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;

@RestController
@RequestMapping("/api/fibo")
public class FiboApiController {

    @PostMapping("/generate/{id}")
    public ResponseEntity<Object> generateFibonacci(@PathVariable Integer id) {
        HashMap<String, ArrayList<Integer>> fibonacciData = new HashMap<>();

        fibonacciData.put("forLoop", calculateFibonacci(id, num -> IterativeFibonacci.calculateFibonacci(num)));
        fibonacciData.put("matrixExpo", calculateFibonacci(id, num -> MatrixExponentiation.calculateFibonacci(num)));
        fibonacciData.put("binetFormula", calculateFibonacci(id, num -> binetFormula.calculateFibonacci(num)));
        fibonacciData.put("recursive", calculateFibonacci(id, num -> RecursiveFibonacci.calculateFibonacci(num)));

        return new ResponseEntity<>(fibonacciData, HttpStatus.OK);
    }

    private ArrayList<Integer> calculateFibonacci(int num, Function<Integer, ArrayList<Integer>> fibonacciMethod) {
        if (num <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer");
        }
        return fibonacciMethod.apply(num);
    }

    // Your Fibonacci calculation classes: IterativeFibonacci, MatrixExponentiation,
    // binetFormula, RecursiveFibonacci
    // Ensure these classes have static methods like calculateFibonacci(int num)
}