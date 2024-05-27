package com.scaler.intermediate.dsa.module3.bit.manipulations.basics;

public class DecimalAddition {
    public static int solution(int n1,int n2){
        int answer  =0;
        int carry = 0;
        int base = 1;
        while(n1 > 0 || n2 > 0 || carry > 0){
            int d1=n1%10;
            int d2=n2%10;
            n1=n1/10;
            n2=n2/10;

            int sum = d1 + d2 + carry;
            int remainder = sum % 10;
            carry = sum / 10;
            answer = answer + base * remainder;
            base = base * 10;
        }

        return answer;
    }
    public static void main(String[] args) {
        int n1 = 89;
        int n2 = 143;
        System.out.println(solution(n1, n2));
    }
}
