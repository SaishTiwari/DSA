package com.tiwarisaish.dsa_learning.arrays;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns= sc.nextInt();

        int num[][] = new int[rows][columns];

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                num[i][j] = sc.nextInt();
            }
        }


        int targetNum = sc.nextInt();

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(num[i][j] == targetNum){
                    System.out.println("The index is "+"("+ i + "," + j+")");
                }

            }
        }


    }
}
