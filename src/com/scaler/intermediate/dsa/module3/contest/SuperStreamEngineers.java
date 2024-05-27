package com.scaler.intermediate.dsa.module3.contest;

public class SuperStreamEngineers {

    public static int solve(int[] A, int k, int C) {
        int n = A.length;
        int sum = 0;
        double average = 0;

        for (int i = 0; i < k; i++) {
            sum = sum + A[i];
        }
        average = sum / k;

        if (average < C) {
            return 1;
        }
        for (int i = 1; i <= n - k; i++) {
            int j = i + k - 1;
            sum = sum + A[j] - A[i - 1];
            average = sum / k;
            if (average < C) {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] A = {30,25,40,35,20,45,50,55,22,18,15};
        int B = 3;
        int C  = 30;
        System.out.println(solve(A,B, C));
    }
}
