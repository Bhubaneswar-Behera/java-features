package com.scaler.advanced.dsa.advanceddsa1.module5.arrays.one.dimensional;

import java.util.Arrays;

/**
 * Given Array[n] , where each element is 0.
 * Return final array after performing multiple queries.
 *
 * query(i,x) --> Add x to all number of array starting from i to n-1.
 * Note : Using PrefixSum
 */
public class SubQueryAddition {

    public static int[] solution(int[] array, int[][] queries){
        int n = array.length;;
        int q = queries.length;

        for (int i = 0; i < q ; i++) {
            int index = queries[i][0];
            int value = queries[i][1];
            array[index] = array[index] + value;
        }
        for (int i = 1; i < n ; i++) {
            array[i] = array[i] + array[i-1];
        }
        return array;
    }

    public static void main(String[] args) {
        int n = 7;
        int[] array = new int[n];
        int[][] queries = {{1,3},{4,-2},{3,1}};
        System.out.println(Arrays.toString(solution(array,queries)));

    }
}
