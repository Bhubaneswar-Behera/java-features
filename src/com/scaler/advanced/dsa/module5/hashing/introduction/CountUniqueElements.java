package com.scaler.advanced.dsa.module5.hashing.introduction;

import java.util.HashMap;
import java.util.Map;

/**
 * You are given an array A of N integers. Return the count of elements with frequency 1 in the given array.
 *
 * Input : A = [3, 4, 3, 6, 6] Output : 1
 * Explanation : Only the element 4 has a frequency 1.
 *
 * Input : A = [3, 3, 3, 9, 0, 1, 0] Output : 2
 * Explanation : The elements 9 and 1 has a frequncy 1.
 *
 */
public class CountUniqueElements {
    public static int solve(int[] A) {
        int n = A.length;
        int answer = 0;
        Map<Integer,Integer> hashMap = new HashMap<>();

        for (int i = 0; i < n ; i++) {
            hashMap.put(A[i] , hashMap.getOrDefault(A[i] , 0) + 1);
        }

        for (int x: hashMap.keySet()) {
            if (hashMap.get(x) == 1) {
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] A = {3, 4, 3, 6, 6};
        System.out.println(solve(A));
    }
}
