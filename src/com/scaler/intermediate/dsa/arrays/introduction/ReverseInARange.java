package com.scaler.intermediate.dsa.arrays.introduction;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseInARange {
    public static void reverse(int[] arr,int n, int l, int r) {
        int i = l;
        int j = r;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {
        int i = B;
        int j = C;

        while(i < j){
            int first = A.get(i);
            int second = A.get(j);

            int temp = A.get(i);
            first = A.get(j);
            second = first;


            i++;
            j--;
        }
        return A;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int length = arr.length;
        int l = 1;
        int r = 3;
        reverse(arr,length,l,r);
        System.out.println(Arrays.toString(arr));
    }
}
