package com.scaler.intermediate.dsa.module2.arrays.carry.forward.and.subarrays;

import java.util.ArrayList;
import java.util.Arrays;
/**
 *Print a subarray of an array, given the array
 * the start index and the end index.
 *
 * Example Input : A = [4, 3, 2, 6] B = 1 C = 3
 * Output : [3, 2, 6]
 *
 * Explanation : The subarray of A from 1 to 3 is [3, 2, 6].
 */
public class SubArrayInGivenRange {

    public static void printSubArray(int[] arr, int start, int end){
        for (int i = start; i <= end;i++) {
            System.out.println("["+start+ ","+ arr[i]+"]");
        }
    }

    public static int[] solve(int[] A, int B, int C) {
        int[] answer = new int[C-B+1];
        int j = 0;
        for(int i = B ;i <= C;i++){
            answer[j] = A[i];
            j++;
        }
        return answer;
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {
        ArrayList<Integer> resultList = new ArrayList<>();

        for(int i = B ;i <= C;i++){
            resultList.add(A.get(i));
        }
        return resultList;
    }
    public static void main(String[] args) {
        int[] A = {4,3,2,6};
        int startIndex = 1;
        int endIndex = 3;
        //printSubArray(a,startIndex,endIndex);
        System.out.println(Arrays.toString(solve(A,startIndex,endIndex)));

        ArrayList<Integer> list  =new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(6);
        System.out.println(solve(list,1,3));

    }
}
