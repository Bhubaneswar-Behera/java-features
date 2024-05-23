package com.scaler.advanced.dsa.module4.recursion.two;

import java.util.ArrayList;

public class FindAllIndices {
    public static ArrayList<Integer> occurrence(int[] A ,int  B , int index , ArrayList<Integer> list){
        if (index == B){
            return list;
        }
        list.add(index);
        return occurrence(A,B,index+1,list);
    }
    public static void main(String[] args) {
        int[] A = {4,5,3,1,5,4,5};
        int B = 5;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(occurrence(A,B,-1,list));
    }
}
