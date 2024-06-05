package com.scaler.advanced.dsa.module5.hashing.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an Array of integers B, and a target sum A.
 * Check if there exists a pair (i,j) such that Bi + Bj = A and i!=j.
 *
 *
 * Input : A = 8 B = [3, 5, 1, 2, 1, 2] Output : 1
 * Example : It is possible to obtain sum 8 using 3 and 5.
 *
 * Input : A = 21 B = [9, 10, 7, 10, 9, 1, 5, 1, 5] Output : 0
 * Example : There is no such pair exists.
 */
public class CheckPairSum {

    public static int solveBruteForce(int A, int[] B) {
        int n = B.length;
        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j < n ; j++) {
                if (B[i] + B[j] == A) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static int solve(int A, int[] B) {
        int n = B.length;
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < n ; i++) {
            if (hashSet.contains(A - B[i])) {
                return 1;
            }
            hashSet.add(B[i]);
        }
        return 0;
    }
    public static void main(String[] args) {
        int A = 8;
        int[] B = {3, 5, 1, 2, 1, 2};
        System.out.println(solveBruteForce(A,B));
        System.out.println(solve(A,B));
    }
}
