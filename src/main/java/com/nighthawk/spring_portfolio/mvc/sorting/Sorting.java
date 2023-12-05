package com.nighthawk.spring_portfolio.mvc.sorting;

import java.util.ArrayList;
import java.util.List;

import com.nighthawk.spring_portfolio.mvc.art.Art;

public class Sorting {

    //override to create specific sort
    protected List<Art> sortArt(List<Art> unsortedArts) {
        return new ArrayList<>();
    }

    public SortingResult getSortingResult(List<Art> unsortedArts) {
        long startTime = System.nanoTime();
        List<Art> result = sortArt(unsortedArts);
        long endTime = System.nanoTime();
        long finalTime = endTime - startTime;
        SortingResult sResult = new SortingResult();
        sResult.sortTime = finalTime;
        sResult.sortedArts = result;
        return sResult;
    }
    
}