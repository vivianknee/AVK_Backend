package com.nighthawk.spring_portfolio.mvc.sorting;

//import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.nighthawk.spring_portfolio.mvc.art.Art;

public class Insertion extends Sorting {
    @Override
    public SortingResult sortArt(List<Art> unsortedArts) {
        SortingResult result = new SortingResult();

        for (int i = 1; i < unsortedArts.size(); i++) {
            Art currArt = unsortedArts.get(i);
            int j = i - 1;

            // find currArt correct spot
            while (j >= 0 && unsortedArts.get(j).getLike() < currArt.getLike()) {
                unsortedArts.set(j + 1, unsortedArts.get(j));
                j -= 1;
                List<Integer> step = unsortedArts.stream().
                        map(art -> art.getLike()).
                        collect(Collectors.toList());
                    
                result.sortingSteps.add(step);
            }
            // put currArt at correct spot
            unsortedArts.set(j + 1, currArt);

            List<Integer> step = unsortedArts.stream().
                        map(art -> art.getLike()).
                        collect(Collectors.toList());
                    
            result.sortingSteps.add(step);
        }
        result.sortedArts = unsortedArts;
        return result;
    }
}