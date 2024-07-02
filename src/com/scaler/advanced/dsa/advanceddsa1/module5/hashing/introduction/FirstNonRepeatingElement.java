package com.scaler.advanced.dsa.advanceddsa1.module5.hashing.introduction;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingElement {
    public static int solve(int[] A) {
        int n = A.length;
        Map<Integer,Integer> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            hashMap.put(A[i], hashMap.getOrDefault(A[i] , 0)+1);
        }

        for (int i = 0; i < n ; i++) {
            if (hashMap.get(A[i]) == 1) {
                return  A[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] A = {10, 5, 3, 4, 3, 5, 6};
        System.out.println(solve(A));
    }
}
