package com.scaler.intermediate.dsa.module2.arrays.sliding.window.contribution;

/**
 * Given an array of length , print start
 * and end indexes of all subarray of length k.
 *
 */
public class PrintSubArrayIndexes {
    public static void printSubArray1(int[] A, int n , int k){
        int  i= 0;
        int j = k -1;
        while(j < n){
            System.out.println(i + " " +j);
            i++;
            j++;
        }
    }

    public static void printSubArray2(int[] A, int n , int k){
       for(int i = 0;i < n - k;i++ ){
           int j = i + k -1;
           System.out.println(i + " "+j);
       }
    }
    public static void main(String[] args) {
        int[] A = {3,7,6,4,19,2,5,8};
        int n = A.length;
        int k = 3;
        printSubArray2(A,n,k);
        printSubArray2(A,n,k);
    }
}

