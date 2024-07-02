package com.scaler.advanced.dsa.advanceddsa1.module5.bit.maniplutaion.two;

/**
 * Given an array A. For every pair of indices i and j (i != j), find the maximum A[i] & A[j].
 *
 * Input : A = [53, 39, 88] Output :37
 *Explanation :-
 * 53 & 39 = 37
 * 39 & 88 = 0
 * 53 & 88 = 16
 * Maximum among all these pairs is 37
 *
 *
 * Input : A = [38, 44, 84, 12] Output : 36
 * Explanation :-
 * Maximum bitwise and among all pairs is (38, 44) = 36
 */
public class MaximumANDPair {

    public static int solve(int[] A) {
        int n = A.length;
        int answer = 0;
        for (int i = 31; i >= 0; i--) {
            int count = 0;

            for (int j = 0; j < n ; j++) {
                if ((A[j] & (1<<i)) > 0) {
                    count++;
                }
            }
            if (count >= 2) {
                answer = answer | (1<<i);
                for (int j = 0; j < n ; j++) {
                    if ((A[j]&(1<<i)) == 0) {
                        A[j] = 0;
                    }

                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] A = {53, 39, 88};
        System.out.println(solve(A));
    }
}
