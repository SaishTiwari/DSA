package com.tiwarisaish.dsa_learning.recursion;

public class Factorial {


    public static void main(String[] args) {

        int b = Factorial(5);
        System.out.println(b);

    }

    public static int Factorial(int n){

        if(n==0 || n==1){
            return 1;
        }

        int fact  = 1;

        return n*Factorial(n-1);
    }
}
