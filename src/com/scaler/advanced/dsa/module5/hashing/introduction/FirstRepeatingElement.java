package com.scaler.advanced.dsa.module5.hashing.introduction;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an integer array A of size N, find the first repeating element in it.
 * We need to find the element that occurs more than once and whose index of the first occurrence is the smallest.
 * If there is no repeating element, return -1.
 *
 * Input : A = [10, 5, 3, 4, 3, 5, 6]  Output : 5
 * Explanation  :5 is the first element that repeats
 *
 * Input : A = [6, 10, 5, 4, 9, 120]   Output : -1
 * Explanation : There is no repeating element, output -1
 *
 */
public class FirstRepeatingElement {
    public static int solve(int[] A) {
        int n = A.length;
        Map<Integer,Integer> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            hashMap.put(A[i], hashMap.getOrDefault(A[i] , 0) +1);
        }

        for (int i = 0; i < n;i++) {
            if (hashMap.get(A[i]) > 1) {
                return A[i];
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] A = {10, 5, 3, 4, 3, 5, 6};
        System.out.println(solve(A));
    }
}
