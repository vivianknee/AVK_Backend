package com.nighthawk.spring_portfolio.mvc.sorting;

//import java.util.ArrayList;
import java.util.List;

import com.nighthawk.spring_portfolio.mvc.art.Art;

public class Sorting {

    //override to create specific sort
    protected SortingResult sortArt(List<Art> unsortedArts) {
        return new SortingResult();
    }

    public SortingResult getSortingResult(List<Art> unsortedArts) {
        long startTime = System.nanoTime();
        SortingResult result = sortArt(unsortedArts);
        long endTime = System.nanoTime();
        long finalTime = endTime - startTime;
        result.sortTime = finalTime;
        //result.steps.add(unsortedArts);
        return result;
    }

    
    
}
