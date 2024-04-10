package com.scaler.intermediate.dsa.sorting.basics;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] A, int n){
       for(int i = 1; i< n ;i++){
           int current = A[i];
           int j = i - 1;

           while(j >= 0 && current < A[j]){
               A[j+ 1] = A[j];
               j--;
           }
           A[j+1] = current;
       }
    }
    public static void main(String[] args) {
        int[] A = {5,6,4,2};
        int n = A.length;
        System.out.println(Arrays.toString(A));
        insertionSort(A,n);
        System.out.println(Arrays.toString(A));

    }
}
