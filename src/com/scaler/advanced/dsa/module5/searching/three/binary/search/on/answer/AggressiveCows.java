package com.scaler.advanced.dsa.module5.searching.three.binary.search.on.answer;

import java.util.Arrays;

/**
 * Farmer John has built a new long barn with N stalls.
 * Given an array of integers A of size N where each element of the array represents the location of the stall and an integer B which represents the number of cows.
 *
 * His cows don't like this barn layout and become aggressive towards each other once put into a stall.
 * To prevent the cows from hurting each other, John wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible.
 * What is the largest minimum distance?
 *
 * Input : A = [1, 2, 3, 4, 5]  B = 3  Output : 2
 * Explanation : John can assign the stalls at location 1, 3 and 5 to the 3 cows respectively.
 *               So the minimum distance will be 2.
 *
 * Input : A = [1, 2]           B = 2  Output : 1
 * Explanation 2: The minimum distance will be 1.
 *
 *
 */
public class AggressiveCows {

    public static int solve(int[] A, int B) {
        Arrays.sort(A);
        int n = A.length;
        int low = 1;
        int high = A[n-1] - A[0];
        int answer = 0;
        while (low <= high) {
            int mid = low + (high-low)/2;
            if(numberOfCows(A,n,mid) >= B){
                answer = mid;
                low = mid  +1;
            } else {
                high = mid - 1;
            }
        }

        return answer;
    }
    public static int numberOfCows(int[] A , int n , int mid){
        int num = 1;
        int last = A[0];

        for (int i = 0; i < n; i++) {
            if (A[i] - last >= mid) {
                num++;
                last = A[i];
            }
        }
        return num;
    }
    public static void main(String[] args) {
       int[] A = {1, 2, 3, 4, 5};
       int B = 3;
        System.out.println(solve(A,B));
    }
}
