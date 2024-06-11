package com.scaler.advanced.dsa.module5.searching.one.binary.seacrh.on.array;

/**
 *
 * Given a sorted array with n element , searvch and return
 * the index of the element k. If not present then return -1.
 * Distinct elements.
 *
 * Input : A [3,6,9,12,14,19,20,23,25,27] , int k = 12
 * Output : 3
 */
public class SimpleBinarySearch {

    public static int binarySearch(int[] A, int n, int k){
        int l = 0;
        int h = n - 1;

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
        int[] A = {3,6,9,12,14,19,20,23,25,27};
        int n = A.length;
        int k = 12;
        System.out.println(binarySearch(A,n,k));
    }
}
