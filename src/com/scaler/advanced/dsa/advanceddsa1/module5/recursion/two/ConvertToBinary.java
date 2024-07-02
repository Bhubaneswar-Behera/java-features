package com.scaler.advanced.dsa.advanceddsa1.module5.recursion.two;

public class ConvertToBinary {
    public static int magicFunction(int N){
        if (N == 0) {
            return 0;
        }
        return magicFunction(N/2)*10 + (N%2);
    }
    public static void main(String[] args) {
        int N = 7;
        System.out.println(magicFunction(N));
    }
}
