package com.scaler.advanced.dsa.module4.maths.three.prime.numbers;

public class ExcelColumnNumber {
    public static int titleToNumber(String A) {
        int n = A.length();
        int answer = 0;
        int multiply = 1;

        for (int i = n - 1 ; i >= 0; i--) {
            answer = answer + multiply * (A.charAt(i) - 'A' + 1);
            multiply = multiply * 26;
        }

        return answer;
    }
    public static void main(String[] args) {
        String A = "AA";
        System.out.println(titleToNumber(A));

    }
}
