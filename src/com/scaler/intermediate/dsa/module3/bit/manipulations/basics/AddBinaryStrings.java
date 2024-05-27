package com.scaler.intermediate.dsa.module3.bit.manipulations.basics;

/**
 * Given two binary strings A and B.
 * Return their sum (also a binary string).
 * Example Input : A = "100" B = "11"
 *
 * Output : "111"
 * Explanation : The sum of 100 and 11 is 111.
 */
public class AddBinaryStrings {
    public static String addBinary(String A, String B) {
        int i = A.length() - 1;
        int j = B.length() - 1;
        int carry  = 0;
        String answer  = "";

        while(i>=0 || j>=0 || carry!=0){
            int sum = 0;
            if(i >= 0){
                sum = sum +(A.charAt(i)-'0');
                i--;
            }
            if(j >= 0){
                sum = sum + (B.charAt(j)-'0');
                j--;
            }
            sum = sum + carry;
            int remainder = sum % 2;
            carry = sum / 2;
            answer =  answer + remainder;
        }

        StringBuilder stringBuilder = new StringBuilder(answer);
        stringBuilder.reverse();

       return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String A = "100";
        String B = "11";
        System.out.println(addBinary(A,B));
    }
}
