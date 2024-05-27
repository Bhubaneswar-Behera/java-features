package com.scaler.intermediate.dsa.module2.arrays.carry.forward.and.subarrays;

/**
 * You are given an integer array A of size N.
 *
 * You have to perform B operations. In one operation,
 * you can remove either the leftmost or the rightmost element of the array A.
 * Find and return the maximum possible sum of the B elements that
 * were removed after the B operations.
 *
 * NOTE: Suppose B = 3, and array A contains 10 elements, then you can:
 *
 * Remove 3 elements from front and 0 elements from the back, OR
 * Remove 2 elements from front and 1 element from the back, OR
 * Remove 1 element from front and 2 elements from the back, OR
 * Remove 0 elements from front and 3 elements from the back.
 *
 * Input : A = [5, -2, 3 , 1, 2] B = 3      Output : 8
 * Explanation :
 * Remove element 5 from front and element (1, 2) from back
 * so we get 5 + 1 + 2 = 8
 *
 * Input : A = [ 2, 3, -1, 4, 2, 1 ] B = 4  Output 2: 9
 * Explanation 2:
 * Remove the first element and the last 3 elements.
 * So we get 2 + 4 + 2 + 1 = 9
 *
 */
public class PickFromBothSides {
    public static int solve(int[] A, int B) {
        int n = A.length;
        int answer = Integer.MIN_VALUE;
        int[] prefixSumArray = new int[n];
        int[] suffixSumArray = new int[n];
        prefixSumArray[0] = A[0];
        suffixSumArray[n-1] = A[n-1];


        for(int i = 1; i< n;i++){
            prefixSumArray[i] = prefixSumArray[i - 1] + A[i];
        }
        for (int i = n - 2; i >= 0 ;i--) {
            suffixSumArray[i] = suffixSumArray[i + 1] + A[i];
        }

        //max of
        //B elements from the lhs with no values from rhs
        //B elements from the rhs with no values from lhs
        answer = Math.max(prefixSumArray[B-1],suffixSumArray[n-B]);

        for (int i = 1; i < B;i++) {
            int sum = prefixSumArray[i-1] +suffixSumArray[n-(B-i)];
            answer = Math.max(answer,sum);
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] A = {5,-2,3,1,2};
        System.out.println(solve(A,3));
    }
}
