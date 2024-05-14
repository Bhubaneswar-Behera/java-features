package com.scaler.advanced.dsa.module4.contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumber {
    public static int[] solve(int[][] A) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            int minVal = Integer.MAX_VALUE;
            int minIndex = -1;

            // Find the minimum element in the current row
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] < minVal) {
                    minVal = A[i][j];
                    minIndex = j;
                }
            }

            // Check if the current element is the maximum in its column
            boolean isLucky = true;
            for (int k = 0; k < A.length; k++) {
                if (A[k][minIndex] > minVal) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) {
                answer.add(minVal);
            }
        }

        //luckyNums.stream().mapToInt(Integer::intValue).toArray();

        return answer.stream().mapToInt(Integer::intValue).toArray();

    }
    public static void main(String[] args) {
        int[][] A = {{7,3,15,1},{14,18,10,17},{4,5,11,13},{12,2,9,16}};
        System.out.println(Arrays.toString(solve(A)));
    }
}
