package com.scaler.advanced.dsa.advanceddsa1.module5.arrays.interview.problems;

/**
 * Given an unsorted list of integer array, A of size N.
 * Find the first missing positive integer.
 *
 * Note: Your algorithm should run in O(n) time and use constant space.
 *       Assume all elements are positive
 *
 * Input : [1, 2, 0] Output : 3
 * Explanation : A = [1, 2, 0]
 * First positive integer missing from the array is 3.
 *
 * Input : [3, 4, -1, 1] Output : 2
 * Explanation : A = [3, 4, -1, 1]
 * First positive integer missing from the array is 2.
 */
public class FirstMissingInteger {
    public static int firstMissingPositive(int[] A) {
        int n = A.length;

        for (int i = 0; i < n ; i++) {
            int x = Math.abs(A[i]);
            if(x >= 1 && x <= n){
                A[x - 1] = -1 * Math.abs(A[x-1]);
            }
        }

        for (int i = 1; i <= n; i++) {
            if(A[i-1] > 0){
                return i;
            }
        }

        return n+1;
    }

    public static int firstMissingPositive1(int[] A) {
        int n = A.length;

        //Step : 1 keep int the data in correct position
        for (int i = 0; i < n ; i++) {
            while (A[i] > 0 && A[i] <= n && A[A[i] - 1] != A[i])  {
                int pos = A[i] - 1; //correct position

                //swap
                int temp = A[i];
                A[i] = A[pos];
                A[pos] = temp;
            }
        }
        //Step 2 :
        for (int i = 0; i < n ; i++) {
            if (A[i] != i+1 ) {
                return i+1;
            }
        }
        return n + 1;
    }
    public static void main(String[] args) {
        int[] A = {8,1,4,2,6,3};
        System.out.println(firstMissingPositive(A));
        System.out.println(firstMissingPositive1(A));

    }
}
