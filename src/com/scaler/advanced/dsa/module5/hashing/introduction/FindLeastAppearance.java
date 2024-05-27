package com.scaler.advanced.dsa.module5.hashing.introduction;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * You have the list of ID's , where each ID(integer) represent a learned who
 * tried a contest. A leader's ID shows up X times  if they try x context.
 * Write a programme that looks at the list and fnd out how may distinct Student have tried the least number of
 * contests.
 */
public class FindLeastAppearance {
    public static int findLeastApproach1(int[] A){
        int n = A.length;

        Map<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n ; i++) {
            hashMap.put(A[i] , hashMap.getOrDefault(A[i] , 0)+ 1);
        }

        int min = Integer.MAX_VALUE;
        for (int x: hashMap.keySet()) {
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
