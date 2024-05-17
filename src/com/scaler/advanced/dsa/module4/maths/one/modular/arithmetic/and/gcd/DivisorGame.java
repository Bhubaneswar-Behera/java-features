package com.scaler.advanced.dsa.module4.maths.one.modular.arithmetic.and.gcd;

/**
 * Scooby has 3 three integers A, B, and C.
 * Scooby calls a positive integer special if it is divisible by B and it is divisible by C.
 * You need to tell the number of special integers less than or equal to A.
 *
 * Input : A = 12 B = 3 C = 2
 * Output : 2
 * Explanation :The two integers divisible by 2 and 3 and less than or equal to 12 are 6,12.
 *
 *
 * Input : A = 6 B = 1 C = 4
 * Output : 1
 * Explanation : Only 4 is a positive integer less than equal to 6 which is divisible by 1 and 4.
 */
public class DivisorGame {
    public static int solveBrute(int A, int B, int C) {
        int answer = 0;
        for (int i = 0; i <= A ; i++) {
            if(i % A == 0 && i % B==0){
                answer++;
            }
        }
        return answer;
    }

    public static int solve(int A, int B, int C) {
        int answer = 0;
        int lcm = B * C/ gcd(B,C);
        answer = Math.floorDiv(A,lcm);
        return answer;
    }
    public static int gcd (int A, int B){
        if (B == 0) {
            return A;
        }
        return gcd(B , A % B);
    }
    public static void main(String[] args) {
        int A = 12;
        int B = 3;
        int C = 2;
        System.out.println(solve(A,B,C));
    }
}
