package com.scaler.advanced.dsa.module5.hashing.introduction;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given an array A of N integers.
 * Find the count of the subarrays in the array which sums to zero. Since the answer can be very large, return the remainder on dividing the result with 109+7
 *
 * Input : A = [1, -1, -2, 2] Output : 3
 * Explanation :
 * The subarrays with zero sum are [1, -1], [-2, 2] and [1, -1, -2, 2].
 *
 *
 * Input : A = [-1, 2, -1] Output : 1
 * Explanation :
 * The subarray with zero sum is [-1, 2, -1].
 */
public class CountSubarrayZeroSum {
    public static int solve(int[] A) {
        int n = A.length;
        Map<Long,Integer> hashMap = new HashMap<>();
        hashMap.put(0l,1);
        long sum = 0;
        long answer = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + A[i];
           if (hashMap.containsKey(sum)) {
               int frequency = hashMap.get(sum);
               answer = answer + frequency;
               hashMap.put(sum,frequency + 1);
           } else{
               hashMap.put(sum,1);
           }
        }
        return (int) (answer % 1000000007);
    }
    public static void main(String[] args) {
        int[] A = {1, -1, -2, 2};
        System.out.println(solve(A));

    }
}
