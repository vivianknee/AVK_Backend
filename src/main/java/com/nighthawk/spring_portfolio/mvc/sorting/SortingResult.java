package com.nighthawk.spring_portfolio.mvc.sorting;

import java.util.ArrayList;
import java.util.List;

import com.nighthawk.spring_portfolio.mvc.art.Art;

public class SortingResult {
    public List<Art> sortedArts;

    public Long sortTime;

    public List<List<Integer>> sortingSteps = new ArrayList<List<Integer>>();
}