package com.scaler.intermediate.dsa.arrays;

import java.util.Arrays;

public class ReverseTheArray {
    public static void reverse(int[] arr, int length){
        int i = 0;
        int j = length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i]  = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
