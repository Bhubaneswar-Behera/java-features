package com.scaler.advanced.dsa.advanceddsa2.sorting.quicksort.comparator.problems;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] A, int start,int end){
            if (start < end) {
                int pivotIndex = partition(A,start,end);
                quickSort(A,start,pivotIndex - 1);
                quickSort(A,pivotIndex + 1, end );
            }
    }

    public static int partition(int[] A, int first, int last){
        int pivot = A[first];
        int left = first + 1;
        int right = last;

        while (left <= first) {
            if (A[left] <= pivot) {
                left++;
            } else if (A[right] > pivot) {
                right--;
            } else{
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;
            }
        }
        //swap pivot element with element present at the first
        int temp = A[first];
        A[first] = A[right];
        A[right] = temp;

        return right;
    }

    public static void main(String[] args) {
        int[] A = {54,26,93,17,72,31,44};
        int n = A.length;
        quickSort(A,0, n - 1);
        System.out.println(Arrays.toString(A));

    }
    
}
