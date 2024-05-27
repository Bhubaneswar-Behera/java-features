package com.scaler.advanced.dsa.module5.hashing.introduction;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array A. You have some integers given in the array B.
 * For the i-th number, find the frequency of B[i] in the array A and return a list containing all the frequencies.
 *
 * Input : A = [1, 2, 1, 1] B = [1, 2]  Output : [3, 1]
 * Explanation For :
 *  The frequency of 1 in the array A is 3.
 *  The frequency of 2 in the array A is 1.
 *
 *
 * Input : A = [2, 5, 9, 2, 8] B = [3, 2]  Output : [0, 2]
 * Explanation:
 *  The frequency of 3 in the array A is 0.
 *  The frequency of 2 in the array A is 2.
 *
 */
public class FrequencyOfElementQuery {
    public static int[] solve(int[] A, int[] B) {
        int n = A.length;
        int q = B.length;;

        Map<Integer,Integer> hasMap = new HashMap<>();
        int[] result = new int[q];

        for (int i = 0; i < n ; i++) {
            hasMap.put(A[i],hasMap.getOrDefault(A[i] , 0)+1);
        }

        for (int i = 0; i < q; i++) {
            if (hasMap.containsKey(B[i])) {
                result[i] = hasMap.get(B[i]);
            }else{
                result[i] = 0;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 1, 1};
        int[] B = {1,2};
        System.out.println(Arrays.toString(solve(A,B)));
    }
}
