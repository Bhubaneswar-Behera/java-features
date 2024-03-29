package com.scaler.introduction.to.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array A and an integer B,
 * find the number of occurrences of B in A.
 *
 * Input 1: A = [1, 2, 2], B = 2  Output : 2
 * Input 2: A = [1, 2, 1], B = 3  Output: 0
 */
public class MultipleOccurences {
    public static int solve(int[] A, int B) {
        int count = 0;
        for(int i = 0 ; i < A.length;i++){
            if(A[i] == B){
                count++;
            }
        }
        return count;
    }

    public static int solve(ArrayList<Integer> A, int B) {
        int count = 0 ;
        for(Integer a : A){
            if(a == B){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 2};
        int B = 2;
        System.out.println(solve(A,B));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        System.out.println(solve(list,B));
    }
}
