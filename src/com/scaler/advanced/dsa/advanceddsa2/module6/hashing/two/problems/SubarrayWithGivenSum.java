package com.scaler.advanced.dsa.advanceddsa2.module6.hashing.two.problems;

import java.util.*;

/**
 * Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.
 * If the answer does not exist return an array with a single integer "-1".
 *
 * First sub-array means the sub-array for which starting index in minimum.
 *
 * Input : A = [1, 2, 3, 4, 5]        B = 5      Output : [2, 3]
 * Explanation : [2, 3] sums up to 5.
 * Input : A = [5, 10, 20, 100, 105]  B = 110    Output : [-1]
 * Explanation : No subarray sums up to required number.
 *
 */
public class SubarrayWithGivenSum {

    public static int[] solve(int[] A, int B) {
        int n = A.length;
        int p1 = 0, p2 = 0;
        long sum = A[0];
        while (p2 < n && p1 < n) {
            if (sum < B) {
                // increase the sub-array window. Incr p2. Add new element to sum.
                p2++;
                if (p2 < n) {
                    sum = sum + A[p2];
                }
            } else if (sum > B) {
// decrease the sub-array window. Remove the prev element sum and move p1 to next element.
                if (p1 < n) {
                    sum = sum - A[p1];
                }
                p1++;
            } else {
// we got the window whose sum = B. Build the response array and return.
                int len = p2-p1+1;
                int arr[] = new int[len];
                int j = 0;
                for (int i = p1; i <= p2; i++) {
                    arr[j++] = A[i];
                }
                return arr;
            }
        }

        return  new int[]{-1};
    }

    public static boolean checkSubArrayWithGivenSum(int[] A , int K){
        int n = A.length;
        int sum = 0;
        Set<Integer> hasSet = new HashSet<>();
        hasSet.add(0);

        for (int i = 0; i < n ; i++) {
            sum = sum + A[i];
            if (hasSet.contains(K - A[i])) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
       int A = 5;
       int[] B = {1, 2, 3, 4, 5};
       System.out.println(Arrays.toString(solve(B,A)));
       System.out.println(checkSubArrayWithGivenSum(B,A));
    }
}
