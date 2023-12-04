package com.nighthawk.spring_portfolio.mvc.sorting;

import java.util.Comparator;
import java.util.List;

import com.nighthawk.spring_portfolio.mvc.art.Art;

public class Insertion extends Sorting {
    @Override
    public List<Art> sortArt(List<Art> unsortedArts) {
        unsortedArts.sort(new Comparator<Art>() {
            @Override
            public int compare(Art o1, Art o2) {
                return o1.getLike() - o2.getLike();
            }
        });
        return unsortedArts;
    }
       
    }