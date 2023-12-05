package com.nighthawk.spring_portfolio.mvc.sorting;
import java.util.Comparator;
import java.util.List;

import com.nighthawk.spring_portfolio.mvc.art.Art;

public class Bubble extends Sorting {
    @Override
    public List<Art> sortArt(List<Art> unsortedArts) {
        int n = unsortedArts.size();
        Art temp;
        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-i-1; j++){
                if (unsortedArts.get(j+1).getLike() > unsortedArts.get(j).getLike()){
                    //swap them if first one is less, should be GREATEST to LEAST order
                    temp = unsortedArts.get(j);
                    unsortedArts.set(j, unsortedArts.get(j));
                    unsortedArts.set(j+1, temp);

                }
            }
        }
        /* 
        unsortedArts.sort(new Comparator<Art>() {
            @Override
            public int compare(Art o1, Art o2) {
                return o1.getLike() - o2.getLike();
            }
        });
        */
        return unsortedArts;
    }

    }