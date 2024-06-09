package com.scaler.advanced.dsa.module5.sorting.quicksort.comparator.problems;

public class PartitionTheArray {
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
        System.out.println(partition(A,0,A.length - 1));
    }
}
