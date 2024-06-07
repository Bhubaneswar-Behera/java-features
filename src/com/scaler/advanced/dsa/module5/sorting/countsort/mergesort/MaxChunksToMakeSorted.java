package com.scaler.advanced.dsa.module5.sorting.countsort.mergesort;

/**
 * Given an array of integers A of size N that is a permutation of [0, 1, 2, ..., (N-1)],
 * if we split the array into some number of "chunks" (partitions), and individually sort
 * each chunk. After concatenating them in order of splitting,
 * the result equals the sorted array.
 *
 * What is the most number of chunks we could have made?
 *
 * Input : A = [1, 2, 3, 4, 0]  Output : 1
 * Explanation :
 * A = [1, 2, 3, 4, 0]
 * To get the 0 in the first index, we have to take all elements in a single chunk.
 *
 * Input : A = [2, 0, 1, 3]     Output : 2
 * Explanation :
 *  A = [2, 0, 1, 3]
 *  We can divide the array into 2 chunks.
 *  First chunk is [2, 0, 1] and second chunk is [3].
 */
public class MaxChunksToMakeSorted {
    public static int solve(int[] A) {
        int n = A.length;
        int index = 0;
        int answer = 0;
        int max = 0;

        for (int i = 0; i < n ; i++) {
            max = Math.max(max,A[i]);
            if(max == i){
                answer++;
            }
            index++;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 0};
        System.out.println(solve(A));
    }
}
