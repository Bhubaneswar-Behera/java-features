package com.scaler.intermediate.dsa.sorting.basics;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] A, int n){
        for (int i = 0;i < n - 1  ;i++) {
                int minIndex = i;
             for(int j = i + 1;j < n ;j++){
                 if(A[j] < A[minIndex]){
                     minIndex = j;
                 }
                 int temp = A[minIndex];
                 A[minIndex] = A[i];
                 A[i] = temp;
             }
        }

    }
    public static void main(String[] args) {
        int[] A = {5,6,4,2};
        int n = A.length;
        System.out.println(Arrays.toString(A));
        selectionSort(A,n);
        System.out.println(Arrays.toString(A));
    }
}
