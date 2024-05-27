package com.scaler.intermediate.dsa.module2.arrays.introduction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array A and an integer B.
 * A pair(i, j) in the array is a good pair if i != j
 * and (A[i] + A[j] == B).
 * Check if any good pair exist or not.
 *
 * Input 1:
 *A = [1,2,3,4] B = 7
 *Output : 1
 *
 * Input 2:
 * A = [1,2,4] B = 4
 *Output  :0
 *
 * Input 3:
 * A = [1,2,2] B = 4
 *Output = 0
 *
 */
public class GoodPair {
    public static int solveBrute(int[] A, int B) {

        for(int i = 0 ; i < A.length;i++){
            for(int j = 0 ; j< A.length;j++){
                if(A[i] + A[j] == B && (i != j)) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static int solveOptimized(int[] A, int B) {
           Map<Integer,Integer> hashMap = new HashMap<>();

           for(int i = 0 ; i < A.length;i++){
               int delta = B - A[i];
               if(hashMap.containsKey(delta)){
                   return 1;
               }
               hashMap.put(A[i],i );
           }
           return 0;
    }

    public static int solveUsingArrayList(ArrayList<Integer> A, int B) {
        Map<Integer,Integer> hashMap = new HashMap<>();

        for (int  i = 0 ; i < A.size();i++) {
            int delta = B - A.get(i);
            if(hashMap.containsKey(delta)){
                return 1;
            }
            hashMap.put(A.get(i),i);
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] A = {1,2,3,4};
        //System.out.println(solveBrute(A, 4));
        //System.out.println(solveOptimized(A, 7));
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(solveUsingArrayList(list,7));
    }
}
