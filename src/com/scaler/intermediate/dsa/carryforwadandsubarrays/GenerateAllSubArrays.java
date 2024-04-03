package com.scaler.intermediate.dsa.carryforwadandsubarrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Print all subaarays of a given array.
 *
 */
public class GenerateAllSubArrays {
    public static void printAllSubArray(int[] array, int n){
        for(int i = 0 ; i < n ;i++){
            for(int j = i ; j < n;j++){
                for(int k = i ; k < j ;k++ ) { //print all for start = i, end  = j
                    System.out.print(array[k]+ " ");
                }
                System.out.println();
            }
        }
    }

    public static int[][] solve(int[] A) {
        int n= A.length;
        int resultLength = n*(n+1)/2;
        int[][] result=new int[resultLength][];
        int count=0;
        for(int i=0; i<n;i++)
        {
            for (int j=i; j<n;j++)
            {
                int subArraySize= j-i+1;
                result[count]=new int [subArraySize];
                for (int k=0; k<subArraySize;k++)
                {
                    result[count][k]=A[i+k];
                }
                count++;
            }
        } return result;
    }


    public static void main(String[] args) {
        int[] arr = {4,1,2,3,-1,6,9,8,12};
        //printAllSubArray(arr, arr.length);

        int[] arr1 = {36,63,63,26,87,28,77,93,7};
        int[][] resultArray = solve(arr1);

        for (int[] a : resultArray) {
            System.out.println(Arrays.toString(a) + " ");
        }
    }
}
