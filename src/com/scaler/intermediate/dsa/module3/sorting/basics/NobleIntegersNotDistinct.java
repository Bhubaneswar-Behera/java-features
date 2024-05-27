package com.scaler.intermediate.dsa.module3.sorting.basics;

import java.util.Arrays;

/**
 * Given arr[n] .Find the count of noble integers.
 * Elements are not necessarily distinct.
 *
 * arr[i] is noble if the count of elements smaller than arr[i]
 * and is equal to arr[i].
 *
 *
 *
 */
public class NobleIntegersNotDistinct {

    public static int getNobleIntegerCountBrute(int[] arr, int n) {
        int answer = 0;

        for(int i = 0;i < n;i++){
            int count = 0;
            for(int j = 0; j < n;j++){
                if (arr[j] < arr[i]) {
                    count++;
                }
            }
            if(count == arr[i]){
                answer++;
            }
        }
        return answer;
    }

    public static int getNobleIntegerCount(int[] arr, int n) {
        Arrays.sort(arr);
        int answer = -1;
        int count = 0;

        for(int i = 0;i < n ;i++){
            if(i == 0 || arr[i] != arr[i-1]){
                count = i;
            }
            if(count == arr[i]) {
               return 1;
            }
        }
        return answer != 0 ? 1 : -1;
    }

    /**
     * Given an integer array A, find if an integer p exists in the array such
     * that the number of integers greater than p in the array equals p.
     *
     * Input : A = [3, 2, 1, 3] Output : 1
     * Explanation : For integer 2, there are 2 greater elements in the array.
     *
     * @param arr
     * @param n
     * @return
     */

    public static int solve(int[] A) {
        Arrays.sort(A);
        int n = A.length;
        int answer = 0;


        if(A[n-1] == 0){
            return 1;
        }

        for(int i =n -2 ; i>=0;i--){
            if(A[i] != A[i+1]){
                if((n-i-1) == A[i]){
                    answer++;
                }
            }
        }
        return answer > 0 ? 1 : -1;

    }
    public static void main(String[] args) {
        int[] A = {-3,0,2,2,5,5,5,5,8,8,10,10,10,14};
        int n = A.length;
        System.out.println(getNobleIntegerCountBrute(A,n));
        System.out.println(getNobleIntegerCount(A,n));

        int[] A1 = {5,6,2};
        System.out.println(solve(A1));


    }
}
