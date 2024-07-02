package com.scaler.advanced.dsa.advanceddsa1.module5.bit.maniplutaion.two;

/**
 * You are given an array of integers A of size N.
 *The value of a subarray is defined as BITWISE OR of all elements in it.
 *Return the sum of value of all subarrays of A % 109 + 7.
 *
 * Input : A = [1, 2, 3, 4, 5] Output : 71
 *Explanation :
 *  Value([1]) = 1
 *  Value([1, 2]) = 3
 *  Value([1, 2, 3]) = 3
 *  Value([1, 2, 3, 4]) = 7
 *  Value([1, 2, 3, 4, 5]) = 7
 *  Value([2]) = 2
 *  Value([2, 3]) = 3
 *  Value([2, 3, 4]) = 7
 *  Value([2, 3, 4, 5]) = 7
 *  Value([3]) = 3
 *  Value([3, 4]) = 7
 *  Value([3, 4, 5]) = 7
 *  Value([4]) = 4
 *  Value([4, 5]) = 5
 *  Value([5]) = 5
 *  Sum of all these values = 71
 *
 * Input : A = [7, 8, 9, 10] Output 2: 110
 * Explanation :
 * Sum of value of all subarray is 110.
 */
public class SUBARRAYOR {
    public static int solve(int[] A) {
        long sum = 0;
        long n=((long)(A.length)*(A.length+1))/2;


        for (int j = 0; j < 32; j++) {
            long count = 0;
            long check=0;
            for (int i = 0; i < A.length; i++) {

                if ((A[i] & 1) == 0) {
                    count++;

                }
                if((A[i] & 1) > 0 || i==A.length-1){
                    check+=((count)*(count+1))/2;
                    count=0;
                }
                A[i]=A[i]>>1;
            }

            sum=(sum+((n-check)*(long)(Math.pow(2,j))))%(1000000007);


        }
        return (int)sum;
    }

    public static boolean checkSetBit(int A, int i){
        if(((A>>i)&1) == 1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        System.out.println(solve(A));
    }
}
