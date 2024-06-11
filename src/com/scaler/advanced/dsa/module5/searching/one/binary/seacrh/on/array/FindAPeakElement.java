package com.scaler.advanced.dsa.module5.searching.one.binary.seacrh.on.array;

/**
 * Increasing Decreasing Array :
 *
 * Given an array of integers A, find and return the peak element in it.
 * An array element is considered a peak if it is not smaller than its neighbors.
 * For corner elements, we need to consider only one neighbor.
 *
 * NOTE:
 * It is guaranteed that the array contains only a single peak element.
 * Users are expected to solve this in O(log(N)) time. The array may contain duplicate elements.
 *
 * Input : A = [1, 2, 3, 4, 5]     Output : 5
 * Explanation : 5 is the peak.
 *
 * Input : A = [5, 17, 100, 11]    Output : 100
 * Explanation : 100 is the peak.
 */
public class FindAPeakElement {

    public static int solve(int[] A) {
        int n = A.length;
        int l = 0;
        int h = n - 1;

        if(n==1){
            return A[0];
        }
        if(A[0]>A[1]){
            return A[0];
        }
        if(A[n-1]>=A[n-2]){
            return A[n-1];
        }

        while (l <= h){
            int mid = l + (h-l)/2;
            if ((mid == 0 || A[mid] > A[mid - 1])
               && (mid == n - 1 || A[mid] > A[mid + 1])){
                return A[mid];
            } else if (mid == n -1 || A[mid] < A[mid + 1]) {
                    l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] A = {5, 17, 100, 11};
        System.out.println(solve(A));
    }
}
