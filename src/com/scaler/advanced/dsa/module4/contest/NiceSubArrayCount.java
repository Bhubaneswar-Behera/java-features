package com.scaler.advanced.dsa.module4.contest;

import java.util.HashMap;

public class NiceSubArrayCount {
    public static int solve(int[] arr){
        //{0,1,2} , {1,2,0}, {0,1,2}
        int n = arr.length;
        int count = 0;
        int left = 0;
        HashMap<Integer, Integer> numCounts = new HashMap<>();
        numCounts.put(0, 0);
        numCounts.put(1, 0);
        numCounts.put(2, 0);
        HashMap<Integer, Integer> requiredCount = new HashMap<>();
        requiredCount.put(0, 1);
        requiredCount.put(1, 1);
        requiredCount.put(2, 1);
        int required = 3;

        for (int right = 0; right < n; right++) {
            int num = arr[right];
            numCounts.put(num, numCounts.getOrDefault(num, 0) + 1);
            if (numCounts.get(num).equals(requiredCount.get(num))) {
                required--;
            }

            while (required == 0) {
                count += n - right; // Add all remaining subarrays with right pointer at current position
                int leftNum = arr[left];
                numCounts.put(leftNum, numCounts.get(leftNum) - 1);
                if (numCounts.get(leftNum) < requiredCount.get(leftNum)) {
                    required++;
                }
                left++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[] A = {1,1,1,0,2,2,0,2,1};
        System.out.println(solve(A));
        //output  : 3//{0,1,2} , {1,2,0}, {0,1,2}


    }
}
