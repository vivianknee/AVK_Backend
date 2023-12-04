package com.nighthawk.spring_portfolio.mvc.sorting;

import java.util.ArrayList;
import java.util.List;

import com.nighthawk.spring_portfolio.mvc.art.Art;

public class Sorting {

    protected long finalTime;

    public Sorting() {
        this.finalTime = 0;
    }

    public long getFinalTime() {
        return finalTime;
    }

    public List<Art> sortArt(List<Art> unsortedArts) {
        return new ArrayList<>();
    }

    public List<Art> getFinalTime(List<Art> unsortedArts) {
        long startTime = System.nanoTime();
        List<Art> result = sortArt(unsortedArts);
        long endTime = System.nanoTime();
        finalTime = endTime - startTime;
        return result;
    }
    
}