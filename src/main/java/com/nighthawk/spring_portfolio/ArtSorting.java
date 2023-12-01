package com.nighthawk.spring_portfolio;

import java.util.Arrays;

public class ArtSorting {

    // Insertion Sort
    public static class InsertionSort extends ArtSorting {
        @Override
        public void sort(int[] arr) {
            int n = arr.length;
            for (int i = 1; i < n; ++i) {
                int key = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j] < key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
        }
    }

    // Selection Sort
    public static class SelectionSort extends ArtSorting {
        @Override
        public void sort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                int maxIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] > arr[maxIndex]) {
                        maxIndex = j;
                    }
                }
                int temp = arr[maxIndex];
                arr[maxIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    // Merge Sort
    public static class MergeSort extends ArtSorting {
        @Override
        public void sort(int[] arr) {
            mergeSort(arr, 0, arr.length - 1);
        }

        private void merge(int[] arr, int l, int m, int r) {
            int n1 = m - l + 1;
            int n2 = r - m;

            int L[] = new int[n1];
            int R[] = new int[n2];

            for (int i = 0; i < n1; ++i)
                L[i] = arr[l + i];
            for (int j = 0; j < n2; ++j)
                R[j] = arr[m + 1 + j];

            int i = 0, j = 0;
            int k = l;
            while (i < n1 && j < n2) {
                if (L[i] >= R[j]) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }

            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }

            while (j < n2) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }

        private void mergeSort(int[] arr, int l, int r) {
            if (l < r) {
                int m = (l + r) / 2;
                mergeSort(arr, l, m);
                mergeSort(arr, m + 1, r);
                merge(arr, l, m, r);
            }
        }
    }

    // Bubble Sort
    public static class BubbleSort extends ArtSorting {
        @Override
        public void sort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }

    // Generic sort that the other sorts extend from. also to print the sorted array
    public void printSortedArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Generic sort that the other sorts extend from.
    public void sort(int[] arr) {
        Arrays.sort(arr);
    }

    //calculates time to sort
    public long sortAndMeasureTime(int[] arr) {
        long startTime = System.currentTimeMillis();
        sort(arr);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

}
