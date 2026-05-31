package com.tiwarisaish.dsa_learning.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {1, 1, 5, 2, 3};

        int[] sorted = selectionSort(arr);

        for (int num : sorted) {
            System.out.print(num + " ");
        }

    }


    public static int[] selectionSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            QuickSort.swap(arr, smallestIndex, i);
        }

        return arr;
    }
}