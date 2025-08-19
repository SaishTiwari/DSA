package com.tiwarisaish.dsa_learning.patterns;

public class InvertedHalfPyramid {
    public static void main(String[] args) {

        int rows = 4;

        for(int i=0; i<rows; i++){
            for(int j=0; j<rows-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
