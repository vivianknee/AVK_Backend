package com.nighthawk.spring_portfolio.mvc.sorting.sorts;
import java.util.HashMap;

import com.nighthawk.spring_portfolio.mvc.sorting.Sorting;

public class Bubble extends Sorting {
    @Override
    protected Integer[][] sortArt(HashMap<String, Integer> likes) {
        int n = likes.size();
        String[] artworkNames = likes.keySet().toArray(new String[0]);
        Integer[] likeValues = likes.values().toArray(new Integer[0]);

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (likeValues[j] < likeValues[j + 1]) {
                    // swap elements if in wrong order
                    int tempLike = likeValues[j];
                    likeValues[j] = likeValues[j + 1];
                    likeValues[j + 1] = tempLike;

                    String tempArtwork = artworkNames[j];
                    artworkNames[j] = artworkNames[j + 1];
                    artworkNames[j + 1] = tempArtwork;
                }
            }
        }

        // create and return the steps array
        Integer[][] steps = new Integer[n][2];
        for (int i = 0; i < n; i++) {
            steps[i][0] = likeValues[i];
            steps[i][1] = likes.get(artworkNames[i]);
        }

        return steps;
    }
       
    }