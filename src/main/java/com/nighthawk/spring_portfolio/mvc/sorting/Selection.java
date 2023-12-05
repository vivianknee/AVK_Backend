package com.nighthawk.spring_portfolio.mvc.sorting;

import java.util.Comparator;
import java.util.List;

import com.nighthawk.spring_portfolio.mvc.art.Art;

public class Selection extends Sorting {
    @Override
    public List<Art> sortArt(List<Art> unsortedArts) {
        int n = unsortedArts.size();

        for (int i=0; i<n-1; i++){
            // find min, will swap this with first element
            int minIndex = i;
            for (int j=i+1; j<n; j++){
                if (unsortedArts.get(j).getLike() < unsortedArts.get(minIndex).getLike()){
                    minIndex = j;
                }
            }
            //swap found min element with first element
            Art temp = unsortedArts.get(minIndex);
            unsortedArts.set(minIndex, unsortedArts.get(i));
            unsortedArts.set(i, temp);
        }
        return unsortedArts;
    }
}