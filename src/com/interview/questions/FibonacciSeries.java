package com.interview.questions;

/**
 * Wells Fargo - 23-April-2024
 *
 */
public class FibonacciSeries {
    public static int fibonacciUsingRecursion(int n){
        if (n <= 1) {
            return n;
        }
        return fibonacciUsingRecursion(n - 1) + fibonacciUsingRecursion(n - 2);
    }

    public static void fibonacciWithoutRecursion(int n){
        int n1 = 0;
        int n2 = 1;
        int  n3;
        int i;
        int count=10;
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(i = 2;i < count; ++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3 = n1 + n2;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
        }
    }
    public static void main(String[] args) {
        int n = 5;
        //System.out.println(n + "th Fibonacci Number: " + fibonacciUsingRecursion(n));

       fibonacciWithoutRecursion(5);
    }
}
