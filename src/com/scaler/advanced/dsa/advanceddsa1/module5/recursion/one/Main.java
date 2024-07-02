package com.scaler.advanced.dsa.advanceddsa1.module5.recursion.one;

public class Main {
    public static int findAthFibonacci(int A) {
        if(A == 0){
            return 0;
        }
        if (A== 1){
            return 1;
        }
        return findAthFibonacci(A-2)+findAthFibonacci(A-1);
    }

    public static int findFactorial(int A) {
        if (A <= 0){
            return 1;
        }
        return A * findFactorial(A-1);
    }
    public static void print1ToAFunction(int A){
        if (A == 0 ) {
            return;
        }
        print1ToAFunction(A - 1);
        System.out.print(A +" ");
    }



    public static int sumOfDigits(int A) {
        if (A == 0) {
            return 0;
        }
        return A % 10 + sumOfDigits(A / 10);
    }

    public static void printATo1Function(int A){
        if (A == 0){
            System.out.println();
            return;
        }
        System.out.print(A + " ");
        printATo1Function(A - 1);
    }

    public static int isPalindrome(String A){
        int n = A.length();
        if(n==0 || n == 1){
            return 1;
        }
       if (A.charAt(0) != A.charAt(n-1)){
            return 0;
        }
        return isPalindrome(A.substring(n-1));
    }
    public static void main(String[] args) {
        int  A = 9;
        System.out.println(findAthFibonacci(A));
        int A1 = 5;
        System.out.println(findFactorial(A1));
        int A2 = 10;
        print1ToAFunction(10);
        int A3 = 46;
        System.out.println();
        System.out.println(sumOfDigits(A3));
        int A4 = 10;
        printATo1Function(A4);
        String str = "hello";
        System.out.println(isPalindrome(str));
    }
}
