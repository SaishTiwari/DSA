package com.tiwarisaish.dsa_learning.sorting;

public class InsertionSort {

    public static void main(String[] args) {

        int num[] = {7,8,3,1,2};

        for(int i =1; i< num.length; i++){
            int current = num[i];
            int previous = i-1;

            while(previous>=0 && num[previous]>current){
                num[previous+1] = num[previous];
                previous--;
            }

            num[previous+1] = current;
        }




    }


}
