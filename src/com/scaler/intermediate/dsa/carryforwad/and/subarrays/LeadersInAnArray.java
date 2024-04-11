package com.scaler.intermediate.dsa.carryforwad.and.subarrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given an integer array A containing N distinct integers,
 * you have to find all the leaders in array A.
 * An element is a leader if it is strictly greater than all the
 * elements to its right side.
 *
 * NOTE: The rightmost element is always a leader.
 *
 * Input 1: A = [16, 17, 4, 3, 5, 2] Output :[17, 2, 5]
 * Explanation :
 *  Element 17 is strictly greater than all the elements on the right side to it.
 *  Element 2 is strictly greater than all the elements on the right side to it.
 *  Element 5 is strictly greater than all the elements on the right side to it.
 *  So we will return these three elements i.e [17, 2, 5],
 *  we can also return [2, 5, 17] or [5, 2, 17] or any other ordering.
 *
 * Input 2: A = [5, 4] Output 2: [5, 4]
 *Explanation 2:
 *  Element 5 is strictly greater than all the elements on the right side to it.
 *  Element 4 is strictly greater than all the elements on the right side to it.
 *  So we will return these two elements i.e [5, 4], we can also any other ordering.
 */
public class LeadersInAnArray {

    public static int[] solve(int[] A) {
        int n = A.length;
        int[] result = new int[n];
        int count = 0;
        result[n-1] = A[n-1];
        int max = A[n-1];

        for(int i = n - 2 ;i >=0 ;i--){
            int currentMax = A[i];
            if(currentMax > max){
                result[count] =  A[i];
                max = A[i];
                count++;
            }
        }
        return Arrays.copyOfRange(result,0,count);
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int n = A.size();
        ArrayList<Integer> resultList = new ArrayList<>();
        resultList.add(A.get(n-1));
        int max = A.get(n-1);
        for(int i = n - 2; i >= 0; i--){
            int currentMax = A.get(i);
            if(currentMax > max){
                resultList.add(currentMax);
                max = currentMax;
            }
        }
        return resultList;
    }
    public static int max(int[] A){
        int max = Integer.MIN_VALUE;
        for(int a: A){
            max = Math.max(max,a);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] A = {16, 17, 4, 3, 5, 2};
        System.out.println(Arrays.toString(solve(A)));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(16);
        list.add(17);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(2);
        System.out.println(solve(list));
        //System.out.println(list);
    }
}
