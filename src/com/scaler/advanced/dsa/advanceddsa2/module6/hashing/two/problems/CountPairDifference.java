package com.scaler.advanced.dsa.advanceddsa2.module6.hashing.two.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * You are given an array A of N integers and an integer B.
 * Count the number of pairs (i,j) such that A[i] - A[j] = B and i ≠ j.
 *
 * Since the answer can be very large, return the remainder after dividing the count with 109+7.
 *
 * Input : A = [3, 5, 1, 2] B = 4 Output : 1
 * Example : The only pair is (2, 3) which gives difference as 4
 *
 * Input : A = [1, 2, 1, 2] B = 1 Output : 4
 * Example : The pair which gives difference as 3 are (2, 1), (4, 1), (2, 3) and (4, 3).
 */
public class CountPairDifference {
    public static int solve(int[] A, int B) {
        int n = A.length;
        long answer = 0;
        Map<Integer,Integer> hasMap = new HashMap<>();

        for (int i = 0; i < n ; i++) {
            answer = answer + hasMap.getOrDefault(A[i] - B ,0);
            answer = answer + hasMap.getOrDefault(A[i] + B ,0);
            answer = answer % 1000000007;
            hasMap.put(A[i] , hasMap.getOrDefault(A[i] , 0)+ 1);
        }

        return (int)answer % 1000000007;
    }
    public static void main(String[] args) {
        int[] A = {3, 5, 1, 2};
        int B = 4;
        System.out.println(solve(A,B));
    }
}
