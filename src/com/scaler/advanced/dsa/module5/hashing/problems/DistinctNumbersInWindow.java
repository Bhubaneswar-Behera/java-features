package com.scaler.advanced.dsa.module5.hashing.problems;

import java.util.*;

/**
 * You are given an array of N integers, A1, A2 ,..., AN and an integer B.
 * Return the of count of distinct numbers in all windows of size B.
 * Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.
 *
 * NOTE: if B > N, return an empty array.
 *
 * Input : A = [1, 2, 1, 3, 4, 3] B = 3  Output 1: [2, 3, 3, 2]
 * Explanation :
 *  A=[1, 2, 1, 3, 4, 3] and B = 3
 *  All windows of size B are
 *  [1, 2, 1]
 *  [2, 1, 3]
 *  [1, 3, 4]
 *  [3, 4, 3]
 *  So, we return an array [2, 3, 3, 2].
 *
 * Explanation 2:
 * Window size is 1, so the output array is [1, 1, 1, 1].
 * Input : A = [1, 1, 2, 2]       B = 1  Output 2: [1, 1, 1, 1]
 */
public class DistinctNumbersInWindow {
    public static int[] countDistinctElements(int[] A, int B) {
        int n = A.length;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= n - B ; i++) {
            Set<Integer> hashSet = new HashSet<>();
            for (int j = i; j <= i + B - 1 ; j++) {
                hashSet.add(A[j]);
            }
            result.add(hashSet.size());
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] countDistinctElementsOptimized(int[] A, int B) {
        int n = A.length;
        List<Integer> result = new ArrayList<>();
        Map<Integer,Integer> hashMap = new HashMap<>();

        for (int i = 0; i < B   ; i++) {
            hashMap.put(A[i], hashMap.getOrDefault(A[i] , 0)+1 );
        }

        result.add(hashMap.size());

        for (int i = B; i < n ; i++) {
            hashMap.put(A[i - B], hashMap.get(A[i - B]) -1);

            if (hashMap.get(A[i - B]) == 0) {
                hashMap.remove(A[i-B]);
            }
            hashMap.put(A[i], hashMap.getOrDefault(A[i] , 0)+1 );
            result.add(hashMap.size());
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 1, 3, 4, 3};
        int B = 3;

        System.out.println(Arrays.toString(countDistinctElements(A,B)));
        System.out.println(Arrays.toString(countDistinctElementsOptimized(A,B)));

    }
}
