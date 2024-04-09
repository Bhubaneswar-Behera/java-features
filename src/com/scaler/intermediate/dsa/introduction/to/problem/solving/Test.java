package com.scaler.intermediate.dsa.introduction.to.problem.solving;

public class Test {
    public static int solve(int A) {
        int count  = 0;
        for(int i = 0; i <= A;i++){
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(int A){
        return countFactors(A) == 2 ? true : false;
    }
    public static int countFactors(int A){
        int count = 0;
        for(int i = 1 ;i <= A/i;i++){
            if(A % i == 0){
                count++;
                if(i != A/i){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int a = 9;
        System.out.println(solve(a));

    }
}
