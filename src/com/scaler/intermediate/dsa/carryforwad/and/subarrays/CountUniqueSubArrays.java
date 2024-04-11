package com.scaler.intermediate.dsa.carryforwad.and.subarrays;


import java.util.HashSet;
import java.util.Set;

/**
 * Misha likes finding all Subarrays of an Array.
 * Now she gives you an array A of N elements and told you to
 * find the number of subarrays of A, that have unique elements.
 *
 * Since the number of subarrays could be large, return value % 109 +7.
 *
 * Example:
 * Input 1: A = [1, 1, 3] Output : 4
 * Explanation : Subarrays of A that have unique elements only:
 *  [1], [1], [1, 3], [3]
 * Input 2: A = [2, 1, 2] Output : 5
 * Explanation : Subarrays of A that have unique elements only:
 *  [2], [1], [2, 1], [1, 2], [2]
 *
 */
public class CountUniqueSubArrays {

    public static int solve(int[] A) {
        int n = A.length;
        Set<Integer> set = new HashSet<>();
        long count = 0;
        int i = 0;
        int j = 0;

        while(j < n){
            if(set.contains(A[j])){
                set.remove(A[i]);
                i++;
            } else {
                set.add(A[j]);
                count = count + j - i +1;
                j++;
            }
        }
        return (int)(count % 1000000007);
    }

    public static void main(String[] args) {
        int[] A = {1, 1, 3};
        System.out.println(solve(A));

    }
}
