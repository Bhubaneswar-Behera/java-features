package com.scaler.advanced.dsa.module4.recursion.two;

/**
 * Implement pow(A, B) % C.
 * In other words, given A, B and C, Find (AB % C).
 * Note: The remainders on division cannot be negative.
 * In other words, make sure the answer you return is non-negative.
 *
 * Input : A = 2 B = 3 C = 3  Output : 2
 * Explanation : 23 % 3 = 8 % 3 = 2
 *
 * Input : A = 3 B = 3 C = 1  Output : 0
 * Explanation : 33 % 1 = 27 % 1 = 0
 */
public class ImplementPowerFunction {

    public static int pow(int A, int B, int C) {
        if(A == 0){
            return 0;
        }
        if(B == 0){
            return 1;
        }
        long halfPower = pow(A,B/2,C);
        long answer = (halfPower * halfPower) % C;

        if (B % 2 == 0) {
            return (int)answer;
        } else{
            answer = (int)(answer % C * A % C) % C;
            if(answer < 0){
                answer = answer + C;
            }
        }

        return (int) answer;
    }



    public static void main(String[] args) {
        int A = 2;
        int B = 3;
        int C = 3;
        System.out.println(pow(A,B,C));
    }
}
