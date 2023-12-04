package com.nighthawk.spring_portfolio.mvc.sorting.sorts;

import java.util.HashMap;

import com.nighthawk.spring_portfolio.mvc.sorting.Sorting;

public class Merge extends Sorting {
    @Override
    protected Integer[][] sortArt(HashMap<String, Integer> likes) {
        int n = likes.size();
        String[] artworkNames = likes.keySet().toArray(new String[0]);
        Integer[] likeValues = likes.values().toArray(new Integer[0]);

        mergeSort(likeValues, artworkNames, 0, n - 1);

        // create and return the steps array
        Integer[][] steps = new Integer[n][2];
        for (int i = 0; i < n; i++) {
            steps[i][0] = likeValues[i];
            steps[i][1] = likes.get(artworkNames[i]);
        }

        return steps; 
    }

    private void mergeSort(Integer[] likeValues, String[] artworkNames, int left, int right) {
        if (left < right) {
            // find mid point
            int middle = left + (right - left) / 2;

            // recursively sort both halves
            mergeSort(likeValues, artworkNames, left, middle);
            mergeSort(likeValues, artworkNames, middle + 1, right);

            // merge the sorted halves
            merge(likeValues, artworkNames, left, middle, right);
        }
    }

    private void merge(Integer[] likeValues, String[] artworkNames, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // temp arrays
        Integer[] leftLikes = new Integer[n1];
        String[] leftArtworks = new String[n1];
        Integer[] rightLikes = new Integer[n2];
        String[] rightArtworks = new String[n2];

        // copy data to temp arrays
        System.arraycopy(likeValues, left, leftLikes, 0, n1);
        System.arraycopy(artworkNames, left, leftArtworks, 0, n1);
        System.arraycopy(likeValues, middle + 1, rightLikes, 0, n2);
        System.arraycopy(artworkNames, middle + 1, rightArtworks, 0, n2);

        // merge temp arrays
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftLikes[i] >= rightLikes[j]) {
                likeValues[k] = leftLikes[i];
                artworkNames[k] = leftArtworks[i];
                i++;
            } else {
                likeValues[k] = rightLikes[j];
                artworkNames[k] = rightArtworks[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            likeValues[k] = leftLikes[i];
            artworkNames[k] = leftArtworks[i];
            i++;
            k++;
        }

        while (j < n2) {
            likeValues[k] = rightLikes[j];
            artworkNames[k] = rightArtworks[j];
            j++;
            k++;
        }
    }
       
    }
