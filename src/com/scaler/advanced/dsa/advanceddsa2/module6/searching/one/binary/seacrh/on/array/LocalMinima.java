package com.scaler.advanced.dsa.advanceddsa2.module6.searching.one.binary.seacrh.on.array;

/**
 * A[n] distinct element. Find any local minima of the array.
 * Local minima :-> number which is smaller than its adjacent neighbors
 *
 * A[] {3,6,1,0,9,15,8}
 * Output  : 3
 *
 * Explanation 3 ,0 and 8 are local minima . So return any of the local minimum numbers.
 */
public class LocalMinima {

    public static int localMinima(int[] A){
        int n = A.length;
        int l = 0;
        int h = n -1;

        while (l<=h){
            int mid = l + (h - l) / 2;
            if ((mid == 0 || A[mid] < A[mid - 1])
                    && (mid == n-1 || A[mid] < A[mid + 1])) {
                return mid;
            } else if (mid == 0 || A[mid] < A[mid-1]) {
                l = mid  + 1;
            } {
                h = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {3,6,1,0,9,15,8};
        System.out.println(localMinima(A));
    }
}
