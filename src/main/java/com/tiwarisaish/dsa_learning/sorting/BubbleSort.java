package com.tiwarisaish.dsa_learning.sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        System.out.println("Enter 5 numbers you want to sort");
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("Array before Sorting");

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }


        int temp =0;
        for(int i=0 ; i<arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }
        }

        System.out.println("After sorting");
            for(int i=0; i<arr.length; i++){
                System.out.println(arr[i]);
            }

        }

    }

