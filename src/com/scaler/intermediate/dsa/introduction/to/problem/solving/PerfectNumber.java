package com.scaler.intermediate.dsa.introduction.to.problem.solving;

/**
 * You are given an integer A. You have to tell whether it is a perfect number or not.
 * Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
 * A proper divisor of a natural number is the divisor that is strictly less than the number.
 *
 * Input : A = 4 Output : 0
 * Input : A = 6 Output : 1
 */

import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {

    private static int solution(int A){
        List<Integer> lists = new ArrayList();

        for(int i = 1 ; i < A;i++){
            if(A % i == 0){
                lists.add(i);
            }
        }

        int sum = 0;
        for (int num: lists) {
            sum = sum + num;
        }

        return sum == A ? 1 : 0;
    }
    public static void main(String[] args) {
        System.out.println(solution(6));
        System.out.println(solution(4));
    }
}
