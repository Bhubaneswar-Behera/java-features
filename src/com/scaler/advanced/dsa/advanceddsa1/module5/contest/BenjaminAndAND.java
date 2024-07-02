package com.scaler.advanced.dsa.advanceddsa1.module5.contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * you are given an array of N integers.You are also given Q queries given the array B.
 * For every queryB[i]. wou need to find the count of pairs of the array A such
 * that0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              the bitwise AND of them has the B[i]-th bit set i.e1(a bit is
 * considered to be set when it has a value of 1.)
 *
 * A = [1,2,3]
 * B = [0,1,2]
 * Output = 1,1,0
 */
public class BenjaminAndAND {
    public static int[] solve(int[] A, int[] B) {
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.stream(A).boxed().collect(Collectors.toList());
        for (int bit : B) {
            int countOnes = 0;
            int total = 0;
            for (int num : A) {
                if (((num >> bit) & 1) == 1) {
                    countOnes++;
                    if (countOnes > 1) {
                        total += countOnes - 1;
                    }
                }
            }
            result.add(total);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] A = {1,2,3};
        int[] B = {0,1,2};

        System.out.println(Arrays.toString(solve(A,B)));
    }
}
