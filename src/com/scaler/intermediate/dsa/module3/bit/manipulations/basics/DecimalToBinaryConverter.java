package com.scaler.intermediate.dsa.module3.bit.manipulations.basics;

public class DecimalToBinaryConverter {
    public static int solution(int n){
        int answer = 0;
        int base = 1;

        while (n > 0) {
            int remainder = n % 2;
            n = n / 2;
            answer = answer + base * remainder;
            base = base * 10;
        }
        return answer;

    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(solution(n));
    }
}
