package com.nighthawk.spring_portfolio.mvc.sorting;

import java.util.ArrayList;
import java.util.List;

import com.nighthawk.spring_portfolio.mvc.art.Art;

public class Merge extends Sorting {
    @Override
    public SortingResult sortArt(List<Art> unsortedArts) {
        SortingResult result = new SortingResult();
        List<Art> sorted = sortArtInternal(unsortedArts);
        result.sortedArts = sorted;
        return result;
    }
    
    private List<Art> sortArtInternal(List<Art> unsortedArts) {
        // list empty or 1 element prob not gonna happen but precaution
        if (unsortedArts.size()<=1){
            return unsortedArts;
        }
        //split list two (half
        int midIndex = unsortedArts.size()/2;
        List<Art> left = new ArrayList<>(unsortedArts.subList(0, midIndex));
        List<Art> right = new ArrayList<>(unsortedArts.subList(midIndex, unsortedArts.size()));
        
        //recursive to keep on splitting and sorting list
        left = sortArtInternal(left);
        right = sortArtInternal(right);

        // merge sorted halves when done each time
        return merge(left, right);
    }
    private List<Art> merge(List<Art> left, List<Art> right) {
        List<Art> mergeDone= new ArrayList<>();
        int leftIndex = 0;
        int rightIndex = 0;

        // compare elements in each half
        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex).getLike() >= right.get(rightIndex).getLike()) {
                mergeDone.add(left.get(leftIndex));
                leftIndex++;
            } else {
                mergeDone.add(right.get(rightIndex));
                rightIndex++;
            }
        }

        // add leftover elements from left
        while (leftIndex < left.size()) {
            mergeDone.add(left.get(leftIndex));
            leftIndex++;
        }

        // add leftover elements from right
        while (rightIndex < right.size()) {
            mergeDone.add(right.get(rightIndex));
            rightIndex++;
        }

       return mergeDone;
    }
}
