package com.nighthawk.spring_portfolio.mvc.fibonacci;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// import com.nighthawk.spring_portfolio.mvc.sortingAlgorithm.SortingAlgorithm;
// import com.nighthawk.spring_portfolio.mvc.sortingAlgorithm.SortRequest;

@RestController
@RequestMapping("/api/fibo") // Sets the path to our dijkstra algorithm
public class FiboApiController {
    // private JSONObject body; //last run result
    // private HttpStatus status; //last run status
    String last_run = null; //last run day of month

    @GetMapping("/{id}")
    public ResponseEntity<Object> getFibonacci(@PathVariable Integer id) {
        HashMap<String, Object> returnValue = new HashMap<String, Object>();
        ForLoopFibo forLoopFibo = new ForLoopFibo();
        WhileLoopFibo whileLoopFibo = new WhileLoopFibo();
        RecursiveFibo recursiveFibo = new RecursiveFibo();
        StreamFibo streamFibo = new StreamFibo();

        returnValue.put("result", forLoopFibo.getNthTerm(id));
        returnValue.put("for_Loop", forLoopFibo.getFinalTime());

        returnValue.put("result", whileLoopFibo.getNthTerm(id));
        returnValue.put("while_Loop", whileLoopFibo.getFinalTime());

        returnValue.put("result", recursiveFibo.getNthTerm(id));
        returnValue.put("recursive", recursiveFibo.getFinalTime());

        returnValue.put("result", streamFibo.getNthTerm(id));
        returnValue.put("stream", streamFibo.getFinalTime());
      
        return new ResponseEntity<>(returnValue, HttpStatus.OK);   
    }
}
