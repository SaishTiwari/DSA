package com.tiwarisaish.dsa_learning.recursion;

public class SumNaturalNum {
    //Sum of first N natural number
    public static void main(String[] args) {


       int b =  Sum(10);
        System.out.println(b);
    }

    public static int Sum(int n){



        if (n==1){
            return n;
        }


         return n + Sum(n-1);




    }
}



