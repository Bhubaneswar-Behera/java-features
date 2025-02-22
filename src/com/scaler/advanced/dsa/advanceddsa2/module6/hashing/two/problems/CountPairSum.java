package com.scaler.advanced.dsa.advanceddsa2.module6.hashing.two.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * You are given an array A of N integers and an integer B. Count the number of pairs (i,j) such that A[i] + A[j] = B and i ≠ j.
 * Since the answer can be very large, return the remainder after dividing the count with 109+7.
 *
 * Note - The pair (i,j) is same as the pair (j,i) and we need to count it only once.
 *
 * Input : A = [3, 5, 1, 2] B = 8  Output : 1
 * Example : The only pair is (1, 2) which gives sum 8
 *
 *
 * Input : A = [1, 2, 1, 2] B = 3  Output : 4
 * Example : The pair which gives sum as 3 are (1, 2), (1, 4), (2, 3) and (3, 4).
 */
public class CountPairSum {

    public static int solve(int[] A, int B) {
        int n = A.length;
        int answer = 0;
        Map<Integer,Integer> hashMap = new HashMap<>();

        for (int i = 0; i < n ; i++) {
            if (hashMap.containsKey(B - A[i])) {
                answer = answer + hashMap.get(B - A[i]);
            }
            hashMap.put(A[i] , hashMap.getOrDefault(A[i] , 0)+ 1);
        }

        return answer % 1000000007;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 1, 2};
        int B = 3;
        System.out.println(solve(A,B));
    }
}
