package com.scaler.advanced.dsa.advanceddsa1.module5.maths.three.prime.numbers;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given an array of integers A, find and return the count of divisors of each element of the array.
 * NOTE: The order of the resultant array should be the same as the input array.
 *
 * Input : A = [2, 3, 4, 5] Output : [2, 2, 3, 2]
 * Explanation :
 * The number of divisors of 2 : [1, 2], 3 : [1, 3], 4 : [1, 2, 4], 5 : [1, 5]
 * So the count will be [2, 2, 3, 2].
 *
 * Input : A = [8, 9, 10] Output : [4, 3, 4]
 * Explanation :
 * The number of divisors of 8 : [1, 2, 4, 8], 9 : [1, 3, 9], 10 : [1, 2, 5, 10]
 * So the count will be [4, 3, 4].
 */
public class CountOfDivisors {
    public static int[] solve(int[] A) {
        int n = A.length;
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int factors = factors(A[i]);
            answer[i] = factors;
        }

        return answer;
    }

    public static int factors(int n){
        int answer = 1;
        int s = smallestPrimeFactor(n)[n];

        while (n > 1) {
            int count = 0;
            while (n % s == 0) {
                n = n / s;
                count++;
            }
            answer = answer * (count+1);
            s = smallestPrimeFactor(n)[n];
        }

        return answer;
    }

    public static int[] smallestPrimeFactor(int n){
        int[] spf = new int[n+1];
        for (int i = 2; i <= n ; i++) {
            spf[i] = i;
        }

        for (int i = 2; i * i <= n ; i++) {
            if (spf[i] == i) {
                for (int j = i*i; j <=n ; j = j + i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }
        return spf;
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int max = 0;
        for(int i = 0; i < A.size(); i++){
            max = Math.max(max, A.get(i));
        }

        int[]cf = new int[max+1];

        for(int i = 1; i <= max; i++){
            for(int j = i; j <= max; j = j+i){
                cf[j] += 1;
            }
        }

        ArrayList<Integer> ans = new ArrayList();
        for(int i = 0; i < A.size(); i++){
            ans.add(cf[A.get(i)]);
        }
        return ans;


    }
    public static void main(String[] args) {
        int[] A = {2, 3, 4, 5};
        System.out.println(Arrays.toString(solve(A)));

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println(solve(arrayList));

    }
}
