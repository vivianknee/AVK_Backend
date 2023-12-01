package com.nighthawk.spring_portfolio.mvc.art;

import java.util.Arrays;

public class ArtSorting {

    // Selection Sort
    public static void selectionSortByName(Art[] arts) {
        int n = arts.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arts[j].getName().compareTo(arts[min_idx].getName()) < 0) {
                    min_idx = j;
                }
            }
            // Swap elements
            Art temp = arts[min_idx];
            arts[min_idx] = arts[i];
            arts[i] = temp;
        }
    }

    // Merge Sort
    public static void mergeSort(Art[] arts) {
        mergeSortHelper(arts, 0, arts.length - 1);
    }

    private static void mergeSortHelper(Art[] arts, int left, int right) {
        if (left < right) {
            if (right - left < 10) { // Use insertion sort for smaller datasets
                insertionSortByYears(arts, left, right);
            } else {
                int mid = (left + right) / 2;

                // Sort first and second halves
                mergeSortHelper(arts, left, mid);
                mergeSortHelper(arts, mid + 1, right);

                // Merge the sorted halves
                merge(arts, left, mid, right);
            }
        }
    }

    private static void merge(Art[] arts, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        Art[] L = Arrays.copyOfRange(arts, left, left + n1);
        Art[] R = Arrays.copyOfRange(arts, mid + 1, mid + 1 + n2);

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i].getYears() <= R[j].getYears()) {
                arts[k] = L[i];
                i++;
            } else {
                arts[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arts[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arts[k] = R[j];
            j++;
            k++;
        }
    }

    // Insertion Sort
    public static void insertionSortByYears(Art[] arts, int left, int right) {
        for (int i = left + 1; i <= right; ++i) {
            Art key = arts[i];
            int j = i - 1;

            while (j >= left && arts[j].getYears() > key.getYears()) {
                arts[j + 1] = arts[j];
                j = j - 1;
            }
            arts[j + 1] = key;
        }
    }

    // Bubble Sort
    public static void bubbleSortByAge(Art[] arts) {
        int n = arts.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arts[j].getAge() > arts[j + 1].getAge()) {
                    // Swap elements
                    Art temp = arts[j];
                    arts[j] = arts[j + 1];
                    arts[j + 1] = temp;
                }
            }
        }
    }
}
