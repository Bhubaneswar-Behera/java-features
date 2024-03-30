package com.scaler.intermediate.dsa.arrays;

import java.util.ArrayList;

public class SecondLargest {

    public static int solve1(int[] A) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0 ; i < A.length ;i++){
            max = Math.max(max,A[i]);
        }

        for(int  i = 0 ; i < A.length;i++){
            if(A[i] != max && A[i] > secondMax){
                secondMax  =A[i];
            }
        }
        return secondMax == Integer.MIN_VALUE ? -1:secondMax;
    }

    public static int solve(int[] A) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0 ; i < A.length ;i++){
            max = Math.max(max,A[i]);
        }

        for(int  i = 0 ; i < A.length;i++){
            if(A[i] != max){
                secondMax = Math.max(secondMax,A[i]);
            }
        }
        return secondMax == Integer.MIN_VALUE ? -1:secondMax;

    }

    public static int solve(ArrayList<Integer> A) {
       int max = Integer.MIN_VALUE;
       int secondMax = Integer.MIN_VALUE;

       for (Integer a : A) {
           max = Math.max(max,a);
       }
       for(Integer a : A){
           if(a != max  ){
               secondMax = Math.max(secondMax,a);
           }
       }


       return  secondMax == Integer.MIN_VALUE ? -1 : secondMax;
    }


    public static void main(String[] args) {
        int[] arr = {4,4,4};
        System.out.println(solve(arr));
        ArrayList list = new ArrayList<>();
        list.add(4);
        list.add(4);
        list.add(4);
        System.out.println(solve(list));
    }
}
