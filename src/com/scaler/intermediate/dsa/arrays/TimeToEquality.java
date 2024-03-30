package com.scaler.intermediate.dsa.arrays;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Given an integer array A of size N.
 * In one second, you can increase the value of one element by 1.
 *
 * Find the minimum time in seconds to make all
 * elements of the array equal.
 *Example: Input A = [2, 4, 1, 3, 2]  Output :8
 */
public class TimeToEquality {
    public static int solve(int[] A) {
        int max = Integer.MIN_VALUE;

        for(int  i = 0 ; i < A.length;i++){
            max = Math.max(max,A[i]);
        }

        int totalSecond = 0;
        for(int  i = 0 ;i < A.length;i++){
            int currentSecond = 0;
            currentSecond = max - A[i];
            totalSecond = totalSecond+currentSecond;
        }
        return totalSecond;
    }
    public static int solveUsingArrayList(ArrayList<Integer> A) {
       int answer = 0;
       int length = A.size();
       int max = Integer.MIN_VALUE;
       for(int i = 0 ; i < length ; i++){
           max = Math.max(max,A.get(i));
       }


       for(int  i = 0 ;i < A.size() ;i++){
           int currentTime = max - A.get(i);
           answer = answer + currentTime;
       }


        return answer;
    }
    public static int solve(ArrayList<Integer> A) {
        int answer = 0;
        Collections.sort(A);

        for(int i = 0 ; i < A.size() -1;i++){
            answer = answer + (A.size() -1 - A.get(i));
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] A = {2, 4, 1, 3, 2};
        System.out.println(solve(A));


        ArrayList list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println(solveUsingArrayList(list));
        System.out.println(solve(list));

    }
}
