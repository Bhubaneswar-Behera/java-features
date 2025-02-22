package com.scaler.advanced.dsa.advanceddsa2.module6.twopointers;

import java.util.Arrays;

/**
 * Given an array A of N integers, find three integers in A such that the
 * sum is closest to a given number B. Return the sum of those three integers.
 * Assume that there will only be one solution.
 *
 * Input : A = [-1, 2, 1, -4]   B = 1   Output : 2
 * Explanation : The sum that is closest to the target is 2. (-1 + 2 + 1 = 2)
 *
 * Input : A = [1, 2, 3]        B = 6   Output : 6
 * Explanation : Take all elements to get exactly 6.
 */
public class ThreeSum {

    public static int threeSumClosest(int[] A, int B) {
        int n = A.length;
        Arrays.sort(A);
        int closestSum = A[0] + A[1] + A[2];
        int difference = Math.abs(B - closestSum);

        for(int i = 0; i < n - 2; i++){
            int j = i + 1;
            int k = n - 1;

            while(j < k){
                int currentSum = A[i] + A[j] + A[k];
                int currentDifference = Math.abs(B - currentSum);

                if(currentDifference == 0) {
                    return currentSum;
                }
                if(currentDifference < difference){
                    difference = currentDifference;
                    closestSum = currentSum;
                }
                if(currentSum < B){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return closestSum;
    }
    public static void main(String[] args) {
        int[] A = {-1, 2, 1, -4};
        int B = 1;
        System.out.println(threeSumClosest(A,B));
    }
}
