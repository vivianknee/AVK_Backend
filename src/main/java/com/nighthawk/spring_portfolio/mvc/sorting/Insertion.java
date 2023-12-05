package com.nighthawk.spring_portfolio.mvc.sorting;

//import java.util.Comparator;
import java.util.List;

import com.nighthawk.spring_portfolio.mvc.art.Art;

public class Insertion extends Sorting {
    @Override
    public List<Art> sortArt(List<Art> unsortedArts) {
        for (int i = 1; i < unsortedArts.size(); i++) {
            Art currArt = unsortedArts.get(i);
            int j = i - 1;

            // find currArt correct spot
            while (j >= 0 && unsortedArts.get(j).getLike() < currArt.getLike()) {
                unsortedArts.set(j + 1, unsortedArts.get(j));
                j -= 1;
            }
            // put currArt at correct spot
            unsortedArts.set(j + 1, currArt);
        }
        return unsortedArts;
    }
}