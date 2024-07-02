package com.scaler.advanced.dsa.advanceddsa1.module5.maths.one.modular.arithmetic.and.gcd;

/**
 * Given an integer array A of size N.
 * You have to delete one element such that the GCD(Greatest common divisor) of the remaining array is maximum.
 * Find the maximum value of GCD.
 *
 * Input : A = [12, 15, 18] Output : 6
 * Explanation :
 *  If you delete 12, gcd will be 3.
 *  If you delete 15, gcd will be 6.
 *  If you delete 18, gcd will 3.
 *  Maximum value of gcd is 6.
 *
 *
 *
 * Input : A = [5, 15, 30] Output : 15
 * Explanation 2:
 *  If you delete 5, gcd will be 15.
 *  If you delete 15, gcd will be 5.
 *  If you delete 30, gcd will be 5.
 *  Maximum value of gcd is 15.
 *
 */

import java.util.ArrayList;

public class DeleteOne {
    public static int solve(ArrayList<Integer> A) {
        int n = A.size();

        int[] prefixGcd = new int[n];
        int[] suffixGcd = new int[n];

        prefixGcd[0] = A.get(0);
        suffixGcd[n - 1] = A.get(n - 1);


        // Calculate prefixGcd array
        for (int i = 1; i < n; i++) {
            prefixGcd[i] = gcd(prefixGcd[i - 1], A.get(i));
        }

        // Calculate suffixGcd array
        for (int i = n - 2 ; i >= 0 ; i--) {
            suffixGcd[i] = gcd(suffixGcd[i+1], A.get(i));
        }

        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < n ; i++) {
            int currentGcd = 0;
            if (i == 0) {
                currentGcd = suffixGcd[i+1];
            } else if (i == n - 1) {
                currentGcd = prefixGcd[i - 1];
            } else {
                currentGcd = gcd(prefixGcd[i - 1], suffixGcd[i + 1]);
            }
            answer = Math.max(answer, currentGcd);
        }



        return answer;

    }

    public static int gcd(int A, int B) {
        if(B == 0){
            return A;
        }

        return gcd(B,A % B);
    }



    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>();
        A.add(12);
        A.add(15);
        A.add(18);

        System.out.println(solve(A));
    }
}
