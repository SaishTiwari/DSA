package com.tiwarisaish.dsa_learning;

import java.util.Scanner;

public class RoughPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int num[] = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("You entered:");
        for (int i = 0; i < size; i++) {
            System.out.println(num[i]);
        }

        sc.close(); // good practice
    }
}