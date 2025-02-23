package com.scaler.advanced.dsa.advanceddsa2.module6.hashing.one.introduction;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * You have the list of ID's , where each ID(integer) represent a learned who
 * tried a contest. A leader's ID shows up X times  if they try x context.
 * Write a programme that looks at the list and fnd out how many distinct
 * Student have tried the least number of contests.
 * Input  : A = { 101,102,103,101,102,101,104,105,106,105,105 }
 * Output : 103,104,106
 * Explanation :
 *  Element     Frequency
 *  101     ->      3
 *  102     ->      2
 *  103     ->      1
 *  104     ->      1
 *  105     ->      3
 *  106     ->      1
 *  3 keys whose value is 1. So the output is  103,104,106
 *
 *
 */
public class ScalerFindLeastAppearance {
    public static int findLeastApproach1(int[] A){
        int n = A.length;

        Map<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n ; i++) {
            hashMap.put(A[i] , hashMap.getOrDefault(A[i] , 0) +  1);
        }

        int min = Integer.MAX_VALUE;
        for (int x : hashMap.keySet()) {
            min = Math.min(min,hashMap.get(x));
        }
        int count = 0;

        for (int x: hashMap.keySet()) {
            if (hashMap.get(x) == min) {
                count++;
            }
        }

        return count;

    }

    public static int findLeastApproach2(int[] A){
        int n = A.length;

        Map<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n ; i++) {
            hashMap.put(A[i] , hashMap.getOrDefault(A[i] , 0)+ 1);
        }

        int min = Integer.MAX_VALUE;
        int count = 0;

        for (int x: hashMap.keySet()) {
            if (hashMap.get(x) == min ) {
                count++;
            } else if (hashMap.get(x) < min) {
                min = hashMap.get(x);
                count = 1;
            }

        }

        return count;

    }
    public static void main(String[] args) {
        int[] A = {101,102,103,101,102,101,104,105,106,105,105};
        System.out.println(findLeastApproach1(A));
        System.out.println(findLeastApproach2(A));
    }
}
