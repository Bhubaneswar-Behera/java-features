package com.scaler.intermediate.dsa.module2.introduction.to.problem.solving;

public class PrimeNumber {

    public static int countFactor(int A){
        int count = 0;

        for(int i = 1 ; i <= A/i;i++){
            if(A % i == 0){
                count++;
                if(i != A/i){
                    count++;
                }

            }
        }

        return count;
    }
    public static int solution(int A){
        return countFactor(A) == 2 ? 1 :0;
    }
    public static void main(String[] args) {
        System.out.println(solution(4));
        System.out.println(solution(6));
    }
}
