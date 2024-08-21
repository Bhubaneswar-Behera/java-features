package com.scaler.advanced.dsa.advanceddsa2.module6.searching.one.binary.seacrh.on.array;

import java.util.Arrays;

/**
 * Given a sorted array of integers A (0-indexed) of size N, find the left most and the right most index of a given integer B in the array A.
 * Return an array of size 2, such that
 *           First element = Left most index of B in A
 *           Second element = Right most index of B in A.
 * If B is not found in A, return [-1, -1].
 * Note : Your algorithm's runtime complexity must be in the order of O(log n).
 *
 * Input : A = [5, 7, 7, 8, 8, 10]  B = 8  Output : [3, 4]
 * Explanation : The first occurrence of 8 in A is at index 3.
 *  The last occurrence of 8 in A is at index 4.
 *  ans = [3, 4]
 *
 * Input : A = [5, 17, 100, 111]    B = 3  Output 2: [-1, -1]
 * Explanation : There is no occurrence of 3 in the array.
 */
public class SearchForARange {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int[] searchRange(final int[] A, int B) {
        int n = A.length;
        int l = 0;
        int h = n - 1;
        int mid = 0;
        int[] answer = {-1,-1};

        //leftIndex
        while (l <= h) {
            mid = l + (h-l)/2;

            if( A[mid] == B ) {
                answer[ 0 ] = mid;
                h = mid - 1;
            }  else if( A[mid] > B) {
                h = mid - 1;
            } else if( A[mid] < B) {
                l = mid + 1;
            }
        }
        l = 0;
        h = n-1;
        mid = 0;

        //rightIndex
        while (l <= h) {
            mid = l + (h-l)/2;
            if( A[mid] == B ) {
                answer[ 1 ] = mid;
                l = mid + 1;
            }
            else if( A[mid] > B) {
                h = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] A = {5, 7, 7, 8, 8, 10};
        int B = 8;
        System.out.println(Arrays.toString(searchRange(A,B)));
    }
}
