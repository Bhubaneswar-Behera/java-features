package com.scaler.advanced.dsa.module4.arrays.one.dimensional;

import java.util.Arrays;

/**
 * Given Array[n] , where each element is 0.
 * Return final array after performing multiple queries.
 *
 * query(i,x) --> Add x to all number of array starting from i to n-1.
 *
 */
public class SubQueryAddition {
    public static int[] solution(int[] array, int[][] queries){
        int n = array.length;;
        int q = queries.length;

        for (int i = 0; i < q; i++) {
                array[queries[i][0]] = array[queries[i][0]]  + queries[i][1];
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
