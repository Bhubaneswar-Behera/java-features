package com.scaler.advanced.dsa.advanceddsa1.module5.arrays.one.dimensional;

public class Main {

    public static int trap(final int[] A) {
        int n = A.length;
        int answer = 0;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = A[0];
        rightMax[n-1] = A[n-1];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], A[i] );
        }

        for (int i = n -2; i >= 0 ; i--) {
            rightMax[i] = Math.max(rightMax[i+1] , A[i]);
        }

        for (int i = 0; i < n ; i++) {
            answer = answer + Math.min(leftMax[i],rightMax[i]) - A[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] A = {0, 1, 0, 2};
        System.out.println(trap(A));
    }
}
