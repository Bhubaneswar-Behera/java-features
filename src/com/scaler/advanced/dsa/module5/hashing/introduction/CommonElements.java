package com.scaler.advanced.dsa.module5.hashing.introduction;

import java.util.*;

/**
 * Given two integer arrays, A and B of size N and M, respectively. Your task is to find all the common elements in both the array.
 * NOTE:
 * Each element in the result should appear as many times as it appears in both arrays.
 * The result can be in any order.
 *
 * Input : A = [1, 2, 2, 1] B = [2, 3, 1, 2]
 * Output : [1, 2, 2]
 * Explanation :
 * Elements (1, 2, 2) appears in both the array. Note 2 appears twice in both the array.
 *
 * Input : A = [2, 1, 4, 10] B = [3, 6, 2, 10, 10]
 * Output : [2, 10]
 *
 * Explanation :
 *  * Elements (2, 10) appears in both the array.
 *
 *
 */
public class CommonElements {
    public static int[] solve(int[] A, int[] B) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
        int n =A.length;
        int q = B.length;
        Map<Integer,Integer> hashMap = new HashMap<>();


        for (int i = 0; i < n ; i++) {
            hashMap.put(A[i] , hashMap.getOrDefault(A[i], 0 )+ 1);
        }

        List<Integer> list=new ArrayList<>();

        for (int i = 0; i < q ; i++) {
            if (hashMap.containsKey(B[i]) && hashMap.get(B[i]) > 0){
                   list.add(B[i]);
                   hashMap.put(B[i],hashMap.get(B[i]) - 1);
                   //hashMap.replace(B[i],hashMap.get(B[i]) - 1);

            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 2, 1};
        int[] B = {2, 3, 1, 2};

        System.out.println(Arrays.toString(solve(A,B)));
    }
}
