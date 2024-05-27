package com.scaler.intermediate.dsa.module3.bit.manipulations.basics;

public class BinaryToDecimalConverter {
    public static int solution(int n){
        int answer = 0;
        int base = 1;


        while (n > 0) {
            int remainder = n % 10;//last digit
            n = n / 10; //remove the last digit
            answer = answer + base * remainder;
            base = base * 2;//increase the base
        }
        return answer;
    }
    public static void main(String[] args) {
        int n = 111;
        System.out.println(solution(n));
    }
}
