package com.scaler.intermediate.dsa.prefixsum;

/**
 * Given an Array of size n, count the number of special indices in the array.
 *
 * Special Index --> A index after removing which , the sum of all
 * even indexed elements is equal to sum of all odd indexed elements.
 *
 * Input : A {4, 3, 2, 7, 6, -2}
 * i      A-A[i]          Sum Of Even          Sum Of Odd        Special Index
 * 0     {3,2,7,6,-2}     3 + 7 + (-2) = 8      2 + 6 = 8          True
 * 1     {4,2,7,6,-2}     4 + 7 + (-2) = 9      2 + 6 = 8          False
 * 2     {4,3,7,6,-2}     4 + 7 + (-2) = 9      3 + 6 = 9          True
 *
 */
public class SpecialIndices {

    public static int solve(int[] A) {
        int n = A.length;

        int[] prefixSumEvenIndexArray = new int[n];
        int[] prefixSumOddIndexArray = new int[n];

        prefixSumEvenIndexArray[0] = A[0];
        prefixSumOddIndexArray[0] = 0;

        for(int  i = 1 ; i < n;i++){
            if (i % 2 == 0) {
                prefixSumEvenIndexArray[i] = prefixSumEvenIndexArray[i - 1]+A[i];
                prefixSumOddIndexArray[i] = prefixSumOddIndexArray[i - 1];
            } else {
                prefixSumOddIndexArray[i] = prefixSumOddIndexArray[i -1] + A[i];
                prefixSumEvenIndexArray[i] = prefixSumEvenIndexArray[i -1 ];
            }
        }
        int count = 0;
        for(int i = 0; i < n ;i++){
            int evnSumIndex = 0;
            int oddSumIndex = 0;

            evnSumIndex = (i == 0 ? 0 : prefixSumEvenIndexArray[i - 1]) + (prefixSumOddIndexArray[n - 1] - prefixSumOddIndexArray[i]);
            oddSumIndex = (i == 0 ? 0 : prefixSumOddIndexArray[i - 1]) + (prefixSumEvenIndexArray[n - 1] - prefixSumEvenIndexArray[i]);
             if (evnSumIndex == oddSumIndex) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 6, -2};
        System.out.println(solve(arr));
    }
}
