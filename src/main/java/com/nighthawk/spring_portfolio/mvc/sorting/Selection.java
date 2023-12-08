package com.nighthawk.spring_portfolio.mvc.sorting;

//import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.nighthawk.spring_portfolio.mvc.art.Art;

public class Selection extends Sorting {
    @Override
    public SortingResult sortArt(List<Art> unsortedArts) {
        SortingResult result = new SortingResult();

        int n = unsortedArts.size();

        for (int i=0; i<n-1; i++){
            // find min, will swap this with first element
            int maxIndex = i;
            for (int j=i+1; j<n; j++){
                if (unsortedArts.get(j).getLike() > unsortedArts.get(maxIndex).getLike()){
                    maxIndex = j;
                }
            }
            //swap found min element with first element
            Art temp = unsortedArts.get(maxIndex);
            unsortedArts.set(maxIndex, unsortedArts.get(i));
            unsortedArts.set(i, temp);

            List<Integer> step = unsortedArts.stream().
                        map(art -> art.getLike()).
                        collect(Collectors.toList());
                    
            result.sortingSteps.add(step);
        }
        result.sortedArts = unsortedArts;

        return result;
    }
}