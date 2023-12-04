package com.nighthawk.spring_portfolio.mvc.sorting.sorts;

import java.util.HashMap;

import com.nighthawk.spring_portfolio.mvc.sorting.Sorting;

public class Insertion extends Sorting {
    @Override
    protected Integer[][] sortArt(HashMap<String, Integer> likes) {
        int n = likes.size();
        String[] artworkNames = likes.keySet().toArray(new String[0]);
        Integer[] likeValues = likes.values().toArray(new Integer[0]);

        for (int i = 1; i < n; i++) {
            int keyLike = likeValues[i];
            String keyArtwork = artworkNames[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than keyLike to one position ahead of their current position
            while (j >= 0 && likeValues[j] < keyLike) {
                likeValues[j + 1] = likeValues[j];
                artworkNames[j + 1] = artworkNames[j];
                j--;
            }

            likeValues[j + 1] = keyLike;
            artworkNames[j + 1] = keyArtwork;
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