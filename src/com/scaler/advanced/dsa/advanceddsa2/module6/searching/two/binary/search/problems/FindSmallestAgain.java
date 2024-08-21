package com.scaler.advanced.dsa.advanceddsa2.module6.searching.two.binary.search.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given an integer array A of size N.
 * If we store the sum of each triplet of the array A in a new list, then find the Bth smallest element among the list.
 *
 * NOTE: A triplet consists of three elements from the array. Let's say if A[i], A[j], A[k] are the elements of the triplet then i < j < k.
 *
 * Input: A = [2, 4, 3, 2] B = 3    Output: 9
 * Explanation :
 * All the triplets of the array A are:
 *  (2, 4, 3) = 9
 *  (2, 4, 2) = 8
 *  (2, 3, 2) = 7
 *  (4, 3, 2) = 9
 *
 *  So the 3rd smallest element is 9.
 * Input 2: A = [1, 5, 7, 3, 2]   B = 9 Output 2: 14
 */
public class FindSmallestAgain {
    public static int solve(int[] A, int B) {
        List<Integer> tripletSums = new ArrayList<>();
        int n = A.length;

        // Generate all triplet sums
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    tripletSums.add(A[i] + A[j] + A[k]);
                }
            }
        }

        // Sort the list of triplet sums
        Collections.sort(tripletSums);

        // Return the B-th smallest sum (1-based index)
        return tripletSums.get(B - 1);
    }
    public static void main(String[] args) {

    }
}
