package com.nighthawk.spring_portfolio.mvc.fibonacci;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/fibo")
public class FiboApiController {

    @PostMapping("/binet/{id}")
    public ResponseEntity<ArrayList<Integer>> calculateFibonacciUsingBinet(@PathVariable int id) {
        ArrayList<Integer> fibonacciList = binetFormula.calculateFibonacci(id);
        return new ResponseEntity<>(fibonacciList, HttpStatus.OK);
    }

    @PostMapping("/golden/{id}")
    public ResponseEntity<ArrayList<Integer>> calculateFibonacciUsingGoldenRatio(@PathVariable int id) {
        ArrayList<Integer> fibonacciList = goldenRatio.findNth(id);
        return new ResponseEntity<>(fibonacciList, HttpStatus.OK);
    }

    // Other endpoints for different Fibonacci methods can also be included
    // similarly
}
