package com.tiwarisaish.dsa_learning.patterns;

public class HalfPyramid {
    public static void main(String[] args) {
        int rows =4;
        int column = 4;

        for (int i=0; i<rows; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
