package com.scaler.intermediate.dsa.module3.sorting.basics;

import java.util.Arrays;

/**
 * Given arr[n] of distinct elements.Find the count of noble integers.
 *
 * arr[i] is noble if the count of elements smaller than arr[i]
 * and is equal to arr[i].
 *
 *Explanation:
 * A     -->  {1 -5  3  5 -10 4}
 * count -->   2  1  3  5  0  4
 * smaller
 *
 * Output  : 3  (As  3, 5 and 4 are noble elements)
 *
 */
public class NobleIntegersDistinct {

    public static int getNobleIntegerCountBrute(int[] arr, int n) {
        int answer = 0;

        for(int i = 0 ; i < n ;i++){
            int count = 0;
           for(int j = 0; j < n;j++){
               if(arr[j] < arr[i]) {
                   count++;
               }
           }
            if(count == arr[i]){
                answer++;
            }
        }

        return answer;
    }

    public static int getNobleIntegerCountWithSorting(int[] arr, int n) {
        int answer = 0;
        Arrays.sort(arr);

        for(int i = 0 ; i < n;i++){
            if (arr[i] == i) {
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
       int[] A = {1,-5,3,5,-10,4};
       int n = A.length;
       System.out.println(getNobleIntegerCountBrute(A,n));
       System.out.println(getNobleIntegerCountWithSorting(A,n));
    }
}
