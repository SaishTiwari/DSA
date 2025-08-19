package com.tiwarisaish.dsa_learning.recursion;

public class Fibbonacci {
    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        int n =7;

        System.out.println(a);
        System.out.println(b);

        Fibo(a,b,n-2);
    }

    public static void Fibo(int a , int b, int n ){

        if(n==0){
            return;
        }

        int c = a+b;
        System.out.println(c);

        Fibo(b,c,n-1);




    }

}

