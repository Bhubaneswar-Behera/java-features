package com.scaler.intermediate.dsa.module2.arrays.carry.forward.and.subarrays;

public class PrintSubArrayFromAGivenRange {

    public static void printSubArray(int[] A,int start, int end){
        int n = A.length;
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,1,2,3,-1,6,9,8,12};
        printSubArray(arr,1,3);
    }
}
