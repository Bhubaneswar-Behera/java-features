package com.scaler.intermediate.dsa.carryforwad.and.subarrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Say you have an array, A, for which the ith element is the
 * price of a given stock on day i.
 * If you were only permitted to complete at most one transaction
 * (ie, buy one and sell one share of the stock),
 * design an algorithm to find the maximum profit.
 *
 * Return the maximum possible profit.
 *
 * Input : A = [1, 2] Output : 1 [Buy the stock on day 0, and sell it on day 1.]
 * Input : A = [1, 4, 5, 2, 4] Output : 4 [Buy the stock on day 0, and sell it on day 2.]
 *
 */
public class BestTimeToBuyAndSellStocks {
    public static int maxProfit(final int[] A) {
        int n = A.length;
        int answer = 0;
        int currentMinimum = Integer.MAX_VALUE;

        for(int i = 0 ;i < n;i++ ){
            currentMinimum = Math.min(currentMinimum,A[i]);
            answer = Math.max(answer , A[i] - currentMinimum);
        }
        return answer;
    }

    public static int maxProfit(final List<Integer> A) {
        int n = A.size();
        if(n == 0){
            return 0;
        }
        int answer = 0;
        int currentMinimum = Integer.MAX_VALUE;
        for(int a : A){
            currentMinimum  = Math.min(currentMinimum, a);
            answer = Math.max(answer,a - currentMinimum);
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] A = {2,1};
        System.out.println(maxProfit(A));

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(2);

        System.out.println(maxProfit(arrayList));

    }
}
