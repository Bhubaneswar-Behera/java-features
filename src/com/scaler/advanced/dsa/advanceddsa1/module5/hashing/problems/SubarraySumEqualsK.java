package com.scaler.advanced.dsa.advanceddsa1.module5.hashing.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers A and an integer B.
 * Find the total number of subarrays having sum equals to B.
 *
 * Input : A = [1, 0, 1] B = 1  Output : 4
 * Explanation : [1], [1, 0], [0, 1] and [1] are four subarrays having sum 1.
 * Input : A = [0, 0, 0] B = 0  Output 2: 6
 * Explanation : All the possible subarrays having sum 0.
 */
public class SubarraySumEqualsK {
    public static int solve(int[] A, int B) {
        int n = A.length;
        int answer = 0;
        int prefixSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i = 0; i < n;i++)
        {
            prefixSum = prefixSum +A[i];
            if(map.containsKey(prefixSum - B)){
                answer = answer + map.get(prefixSum - B);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) +1);
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] A = {1, 0, 1};
        int B = 1;
        System.out.println(solve(A,B));
    }
}
