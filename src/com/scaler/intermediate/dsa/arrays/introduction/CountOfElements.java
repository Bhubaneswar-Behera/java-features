package com.scaler.intermediate.dsa.arrays.introduction;

import java.util.ArrayList;

/**
 * Given an array A of N integers.
 * Count the number of elements
 * that have at least 1 elements greater than itself.
 *
 * Input 1: A = [3, 1, 2] Output : 2
 * Input 2: A = [5, 5, 3] Output : 1
 */
public class CountOfElements {
    public static int solve(int[] A) {
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < A.length;i++){
            max = Math.max(max,A[i]);
        }
        for(int i = 0 ; i < A.length;i++){
            if(A[i] < max){
                answer++;
            }
        }

        return answer;
    }

    public static int solve(ArrayList<Integer> A) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for (Integer a : A) {
            max = Math.max(max,a);
        }

        for (Integer a : A) {
            if(a < max){
                answer++;
            }
        }


        return answer;
    }


    public static void main(String[] args) {
        int[] arr = {5,5,3};
        System.out.println(solve(arr));
        ArrayList list = new ArrayList<>();
        list.add(5);
        list.add(5);
        list.add(3);
        System.out.println(solve(list));
    }
}
