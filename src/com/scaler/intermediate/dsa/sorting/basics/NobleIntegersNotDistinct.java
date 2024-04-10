package com.scaler.intermediate.dsa.sorting.basics;

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
    public static void main(String[] args) {
        int[] A = {-3,0,2,2,5,5,5,5,8,8,10,10,10,14};
        int n = A.length;
        //System.out.println(getNobleIntegerCountBrute(A,n));
        //System.out.println(getNobleIntegerCount(A,n));

        int[] A1 = {5,6,2};
        System.out.println(getNobleIntegerCount(A1,A1.length));


    }
}
