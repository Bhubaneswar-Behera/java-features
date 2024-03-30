package com.scaler.firstday.problem.solving;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer A, you need to find the count of it's factors.
 *
 * Factor of a number is the number which divides it perfectly leaving no remainder.
 *
 * Example : 1, 2, 3, 6 are factors of 6
 *
 *
 */
public class CountFactorsOFANumber {


    public static int countFactorBrute(int A){
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 1 ; i <= A;i++){
            if(A % i == 0){
                list.add(i);
                count++;
            }
        }
        System.out.println(list);
        return count;
    }

    public static int countFactor(int A){
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 1 ; i <= A/i;i++){
            if(A % i == 0){
                count++;
                list.add(i);
                if(i != A/i){
                    list.add(A/i);
                    count++;
                }

            }
        }
        System.out.println(list);
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countFactorBrute(24));
        System.out.println(countFactor(24));
    }
}
