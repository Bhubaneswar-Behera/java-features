package com.scaler.intermediate.dsa.contest;

import java.util.ArrayList;
import java.util.Arrays;

public class PositiveInRange {

    public static int[] solve(int[] A,int[][] B){
        int n = A.length;
        int m = B.length;
        int[] prefixSumArray = new int[n];

        prefixSumArray[0] = (A[0] > 0 ? 1 : 0);

        for(int i = 1; i  < n;i++){
            prefixSumArray[i] = prefixSumArray[i-1] + (A[i] >= 0 ? 1 : 0);
        }

        int[] answer = new int[m];

        for(int i =0;i< m;i++){
            answer[i] = prefixSumArray[B[i][1]] - (B[i][0] == 0 ? 0 : prefixSumArray[B[i][0] - 1]);
        }
        return answer;
    }
    public static void main(String[] args) {

        int[] A = {1,-1,0};
        int[][] B = {{0,2},{1,2}};
        int[] result = solve(A,B);
        System.out.println(Arrays.toString(result));

    }
}
