package com.tiwarisaish.dsa_learning.recursion;

public class PrintNum {
    public static void main(String[] args) {

        PrintNum5to1(5);
        PrintNum1to5(1);

    }

    public static void PrintNum5to1(int n){
        if (n==0){
            return;
        }

        System.out.println(n);
        PrintNum5to1(n-1);
    }

    public static void PrintNum1to5(int n){
        if (n>5){
            return;
        }

        System.out.println(n);
        PrintNum1to5(n+1);
    }
}
