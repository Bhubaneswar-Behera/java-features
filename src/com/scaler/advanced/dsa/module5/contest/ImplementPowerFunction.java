package com.scaler.advanced.dsa.module5.contest;

public class ImplementPowerFunction {
    public static int pow(int A, int B, int C) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.

        if(A == 0){
            return 0;
        }
        if(B == 0){
            return 1;
        }

        long halfPower = pow(A,B/2,C);
        long answer = (halfPower * halfPower) % C;

        if(B % 2 ==0){
            return (int) answer;
        } else {
            answer = (int)(answer % C * A % C) % C;
            if(answer < 0){
                answer = answer + C;
            }
        }

        return (int)answer;

    }

    public static void main(String[] args) {
        int A = 2;
        int B = 3;
        int C = 3;

        System.out.println(pow(A,B,C));


        int A1 = 3;
        int B1 = 3;
        int C1 = 1;

        System.out.println(pow(A1,B1,C1));


    }
}
