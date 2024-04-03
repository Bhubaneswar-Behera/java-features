package com.scaler.intermediate.dsa.carryforwad.and.subarrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *Print a subarray of an array, given the array
 * the start index and the end index.
 *
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
        int startIndex = 0;
        int endIndex = 5;
        //printSubArray(a,startIndex,endIndex);
        //System.out.println(Arrays.toString(solve(A,1,3)));

        ArrayList<Integer> list  =new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(6);
        System.out.println(solve(list,1,3));

    }
}
