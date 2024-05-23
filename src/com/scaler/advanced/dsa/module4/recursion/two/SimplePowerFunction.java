package com.scaler.advanced.dsa.module4.recursion.two;

public class SimplePowerFunction {

    public static int power(int A, int B){
        if(B == 0){
            return 1;
        }
        return A * power(A, B -1);
    }

    public static int powerApproach1(int A, int B){
        if(B == 0){
            return 1;
        }
        if(B % 2 == 0){
            return powerApproach1(A,B/2)* powerApproach1(A,B/2);
        }
        return powerApproach1(A,B/2)*powerApproach1(A,B/2) * A;
    }
    public static int powerApproach2(int A, int B){
        if(B == 0){
            return 1;
        }

        int halfPower = powerApproach2(A,B/2);

        if (B % 2 == 0) {
            return  halfPower * halfPower;
        }
        return halfPower * halfPower * A;
    }
    public static void main(String[] args) {
        int A = 5;
        int B = 2;

        System.out.println(power(A,B));
        System.out.println(powerApproach1(A,B));
        System.out.println(powerApproach2(A,B));

    }

}
