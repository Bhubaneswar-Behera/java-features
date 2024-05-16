package com.scaler.advanced.dsa.module4.maths.one.modular.arithmetic.and.gcd;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers A, calculate the sum of A [ i ] % A [ j ]
 * for all possible i, j pairs. Return sum % (109 + 7) as an output.
 *
 * Input : A = [1, 2, 3] Output : 5
 * Explanation :
 *  (1 % 1) + (1 % 2) + (1 % 3) + (2 % 1) + (2 % 2) + (2 % 3) + (3 % 1) + (3 % 2) + (3 % 3)
 *  (0+1+1) + (0+0+2) + (0+1+0)
 *  = 5
 *
 *
 */
public class ModSum {
    public static int solve(int[] A) {
        int n = A.length;
        long result = 0;
        Map<Integer,Integer> hashMap = new HashMap<>();
        //count the occurrence
        for (int i = 0; i < n ; i++) {
            hashMap.put(A[i],hashMap.getOrDefault(A[i],0)+1);
        }


        for (int i = 0; i < n ; i++) {
            for (Map.Entry<Integer,Integer> entry : hashMap.entrySet()) {
                int element = entry.getKey();
                int countOfElement = entry.getValue();

                result = (result + ((long) A[i] % element) * countOfElement) % 1000000007;
            }
        }

        return (int) result;
    }
    public static void main(String[] args) {
        int[] A =  {1, 2, 3};
        System.out.println(solve(A));
    }
}
