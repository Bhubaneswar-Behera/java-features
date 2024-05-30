package com.scaler.advanced.dsa.module5.hashing.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array A of N integers.
 * Find the length of the longest subarray in the array which sums to zero.
 *
 * If there is no subarray which sums to zero then return 0.
 *
 * Input : A = [1, -2, 1, 2]  Output : 3
 * Explanation : [1, -2, 1] is the largest subarray which sums up to 0.
 *
 * Input : A = [3, 2, -1]     Output : 0
 * Explanation : No subarray sums up to 0.
 */
public class LongestSubarrayZeroSum {

    public static int solve(int[] A) {
        int n = A.length;
        int answer = 0;
        Map<Long,Integer> hasMap = new HashMap<>();
        long sum = 0;
        hasMap.put(sum , -1);
        for (int i = 0; i < n ; i++) {
            sum = sum + A[i];
            if(hasMap.containsKey(sum)){
                answer = Math.max(answer , i - hasMap.get(sum));
            } else {
                hasMap.put(sum,i);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] A = {1, -2, 1, 2};
        System.out.println(solve(A));
    }
}
