package com.scaler.advanced.dsa.advanceddsa2.searching.one.binary.seacrh.on.array;

/**
 * You are given a sorted array A of size N and a target value B.
 * Your task is to find the index (0-based indexing) of the target value in the array.
 *
 * If the target value is present, return its index.
 * If the target value is not found, return the index of least element greater than equal to B.
 * If the target value is not found and least number greater than equal to target is also not present, return the length of array (i.e. the position where target can be placed)
 * Your solution should have a time complexity of O(log(N)).
 *
 * Input : A = [1, 3, 5, 6] B = 5    Output : 2
 * Explanation : The target value is present at index 2.
 *
 * Input : A = [1, 4, 9]    B = 3    Output : 1
 * Explanation : The target value should be inserted at index 1.
 *
 */
public class SortedInsertPosition {

    public static int searchInsert(int[] A, int B) {
        int lo = 0;
        int hi = A.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (A[mid] < B) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return lo;

    }
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 6};
        int B = 5;
        System.out.println(searchInsert(A,B));
    }
}
