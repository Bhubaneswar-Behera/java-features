package com.scaler.advanced.dsa.advanceddsa2.searching.one.binary.seacrh.on.array;

/**
 * Given a sorted array of integers A where every element appears twice except for one element which appears once,
 * find and return this single element that appears only once.
 * Elements which are appearing twice are adjacent to each other.
 *
 * NOTE: Users are expected to solve this in O(log(N)) time.
 *
 * Input : A = [1, 1, 7]   Output : 7
 * Explanation : 7 appears once
 *
 * Input : A = [2, 3, 3]   Output : 2
 * Explanation : 2 appears once
 */
public class SingleElementInSortedArray {

    public static int solve(int[] A) {
        int n = A.length;
        int l = 0;
        int h = n - 1;


        while (l <= h) {
           int mid = l + (h - l) / 2;
            //checking mid is unique --> mid is the target
            if((mid == 0 || A[mid] != A[mid - 1]) && (mid == n -1 || A[mid] != A[ mid + 1])){
                return A[mid];
            } else if (A[mid] == A[mid + 1]) { //at first occurrence
                if (mid % 2 == 0) { // Even Odd Pair
                    l = mid + 2;
                } else {//Odd Even Pair
                    h = mid - 1;
                }
            } else { //second occurrence
                if (mid % 2 == 0) {//Odd Even Pair
                    h = mid - 2;
                } else {//Even Odd Pair
                    l = mid + 1;
                }
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int[] A = {1, 1, 7};
        System.out.println(solve(A));
    }
}
