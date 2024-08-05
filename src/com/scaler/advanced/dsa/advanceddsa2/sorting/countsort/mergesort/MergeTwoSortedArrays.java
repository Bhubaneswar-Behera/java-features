package com.scaler.advanced.dsa.advanceddsa2.sorting.countsort.mergesort;


import java.util.Arrays;

/**
 * Given two sorted integer arrays A and B, merge B and A as one sorted array and return it as an output.
 * Note: A linear time complexity is expected and you should avoid use of any library function.
 *
 * Input : A = [4, 7, 9] B = [2, 11, 19]
 * Output : [2, 4, 7, 9, 11, 19]
 * Explanation : Merging A and B produces the output as described above.
 *
 * Input : A = [1]       B = [2]
 * Output : [1, 2]
 * Explanation :  Merging A and B produces the output as described above.
 */
public class MergeTwoSortedArrays {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int[] solve(final int[] A, final int[] B) {
        int n1 = A.length;
        int n2 = B.length;
        int[] resultArray = new int[n1 + n2];
        int idx = 0;
        int left = 0;
        int right = 0;

        while (left < n1 && right < n2) {
            if (A[left] <= B[right]) {
                resultArray[idx] = A[left];
                idx++;
                left++;
            } else {
                resultArray[idx] = B[right];
                idx++;
                right++;
            }
        }
        while (left < n1) {
            resultArray[idx] = A[left];
            idx++;
            left++;
        }

        while (right < n2) {
            resultArray[idx] = B[right];
            idx++;
            right++;
        }

        return resultArray;
    }

    public static void main(String[] args) {
        int[] A = {4, 7, 9};
        int[] B = {2, 11, 19};

        System.out.println(Arrays.toString(solve(A,B)));
    }
}
