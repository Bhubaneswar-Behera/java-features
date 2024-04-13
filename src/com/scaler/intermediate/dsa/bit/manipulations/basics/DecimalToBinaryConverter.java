package com.scaler.intermediate.dsa.bit.manipulations.basics;

public class DecimalToBinaryConverter {
    public static int solution(int n){
        int answer = 0;
        int base = 1;

        while (n > 0) {
            int remainder = n % 10;
            n = n / 10;
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
