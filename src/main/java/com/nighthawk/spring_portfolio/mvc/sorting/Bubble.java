package com.nighthawk.spring_portfolio.mvc.sorting;
import java.util.List;
import java.util.stream.Collectors;

import com.nighthawk.spring_portfolio.mvc.art.Art;

public class Bubble extends Sorting {
    @Override
    public SortingResult sortArt(List<Art> unsortedArts) {
        SortingResult result = new SortingResult();
        int n = unsortedArts.size();
        Art temp;
        for(int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - 1; j++) {
                if(unsortedArts.get(j).getLike() < unsortedArts.get(j + 1).getLike()) {
                    temp = unsortedArts.get(j);
                    unsortedArts.set(j, unsortedArts.get(j + 1));
                    unsortedArts.set(j + 1, temp);

                    swapped = true;

                    List<Integer> step = unsortedArts.stream().
                        map(art -> art.getLike()).
                        collect(Collectors.toList());
                    
                    result.sortingSteps.add(step);
                }
            }

            if (!swapped) break;
        }
        
        result.sortedArts = unsortedArts;
        
        return result;
    }
}