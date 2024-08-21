package com.scaler.advanced.dsa.advanceddsa2.module6.searching.two.binary.search.problems;

/**
 * Given a sorted array of integers A of size N and an integer B,
 * where array A is rotated at some pivot unknown beforehand.
 *
 * For example, the array [0, 1, 2, 4, 5, 6, 7] might become [4, 5, 6, 7, 0, 1, 2].
 * Your task is to search for the target value B in the array. If found, return its index; otherwise, return -1.
 * You can assume that no duplicates exist in the array.
 *
 * NOTE: You are expected to solve this problem with a time complexity of O(log(N)).
 *
 * Input : A = [4, 5, 6, 7, 0, 1, 2, 3] B = 4    Output : 0
 * Explanation : Target 4 is found at index 0 in A.
 *
 * Input : A : [ 9, 10, 3, 5, 6, 8 ]    B : 5    Output : 3
 * Explanation : Target 5 is found at index 3 in A.
 *
 */
public class SearchInRotatedSortedArray {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int search(final int[] A, int B) {
        int n = A.length;
        int l = 0;
        int h = n - 1;
         int maxIndex = -1;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (A[mid] >= A[0]) {
                maxIndex = mid;
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        if (B >= A[0]) {
            return binarySearch(A,B,0,maxIndex);
        }  else {
            return binarySearch(A,B,maxIndex+1 , n - 1);
        }
        //return -1;
    }

    public static int binarySearch(int[] A, int k ,int l, int h){
        //int h = maxI;

        while (l <= h){
            int mid = l + (h - l) / 2;
            if (A[mid] == k){
                return mid;
            } else if (A[mid] > k) { // go to left
                h = mid - 1;
            } else if(A[mid] < k) { // go to right
                l = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] A = {4, 5, 6, 7, 0, 1, 2, 3};
        int B = 4;
        System.out.println(search(A,B));
    }
}
