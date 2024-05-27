package com.scaler.intermediate.dsa.module3.interview.problems;

/**
 * Given an array of size N, find the majority element.
 * The majority element is the element that appears more than floor(n/2) times.
 * You may assume that the array is non-empty and the majority element always exists in the array.
 *
 * Input : [2, 1, 2] Output : 2
 * Input : [1, 1, 1] Output : 1
 *
 * Moore's Voting Algorithm
 */
public class MajorityElement {
    public static int majorityElement(final int[] A) {
        int n = A.length;
        int majority = Integer.MIN_VALUE;
        int count = 0;

        for(int i = 0 ; i < n;i++){
            if (count == 0) {
                majority = A[i];
                count = 1;
            } else{
                if(majority == A[i]) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        count = 0;
        for (int i = 0; i < n ;i++) {
            if(majority == A[i]){
                count++;
            }
        }
        if(count > n/2){
            return majority;
        }
        return majority;

    }
    public static void main(String[] args) {
        int[] A = {1, 1, 2};
        System.out.println(majorityElement(A));
    }
}
