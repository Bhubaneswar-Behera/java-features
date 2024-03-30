package com.scaler.firstday.problem.solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PerfectNumber {
    public static List<Integer> getFactors(int A) {
        List<Integer> list = new ArrayList<>();

        for(int i = 1 ; i <= A/i ;i++){
            if(A % i == 0){
                list.add(i);
                if(i != A/i){
                    list.add(A/i);
                }
            }
        }
        return list;
    }

    private static int solution(int A){
        List<Integer> lists = new ArrayList();

        for(int i = 1 ; i < A;i++){
            if(A % i == 0){
                lists.add(i);
            }
        }

        System.out.println(lists);
        int sum = 0;
        for(int i = 0 ;i< lists.size();i++){
            sum = sum + lists.get(i);
        }
        if(sum == A){
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(solution(6));
        System.out.println(solution(4));
    }
}
