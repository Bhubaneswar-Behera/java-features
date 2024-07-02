package com.scaler.advanced.dsa.advanceddsa1.module5.recursion.one;

public class Quiz {
    public static int fun(int a,int b){
        if (b == 0){
            return 1;
        } else if ( b % 2 == 0) {
            return fun(a*a,b/2);
        } else {
            return a * fun(a*a,b/2);
        }
    }
    public static void main(String[] args) {
        int answer = fun(2,10);
        System.out.println(answer);
    }
}
