package com.tiwarisaish.dsa_learning;

import java.lang.reflect.Array;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder s = new StringBuilder(input) ;

        for(int i=0; i<s.length()/2; i++){

            int a = i;
            int b = s.length()-i-1;

            char frontchar = s.charAt(a);
            char backchar  = s.charAt(b);

            s.setCharAt(a, backchar);
            s.setCharAt(b, frontchar);



        }

        System.out.println(s);



    }
}
