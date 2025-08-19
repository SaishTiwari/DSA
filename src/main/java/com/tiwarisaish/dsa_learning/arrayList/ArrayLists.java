package com.tiwarisaish.dsa_learning.arrayList;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

    public static void main(String[] args) {

        ArrayList <Integer> list  = new ArrayList<>();

        list.add(4);
        list.add(7);
        list.add(6);
        list.add(2);
        list.add(3);


        System.out.println("The size is "+list.size());

        Collections.sort(list);

        System.out.println(list);


    }


}
