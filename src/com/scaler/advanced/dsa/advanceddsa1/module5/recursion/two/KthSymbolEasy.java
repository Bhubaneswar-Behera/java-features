package com.scaler.advanced.dsa.advanceddsa1.module5.recursion.two;

import java.util.ArrayList;
import java.util.List;

/**
 * On the first row, we write a 0. Now in every subsequent row,
 * we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.
 * Given row number A and index B, return the Bth indexed symbol in row A. (The values of B are 0-indexed.).
 *
 * Input : A = 3 B = 0  Output : 0
 * Explanation :
 *  Row 1: 0
 *  Row 2: 01
 *  Row 3: 0110
 *  Output is 0 as Oth index is 0.
 *
 *
 * Input : A = 4 B = 4  Output : 1
 * Explanation :
 *   Row 1: 0
 *   Row 2: 01
 *   Row 3: 0110
 *   Row 4: 01101001
 *
 *
 */
public class KthSymbolEasy {

    public static int solve(int A, int B) {
        List<Integer> list = getKthSymbol(A);
        return list.get(B);
    }

    public static List<Integer> getKthSymbol(int A){
        if(A == 1){
            List<Integer> tempList = new ArrayList<>();
            tempList.add(0);
            return tempList;
        }
        List<Integer> symbolList = getKthSymbol(A - 1);
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < symbolList.size(); i++) {
            if (symbolList.get(i) == 0) {
                resultList.add(0);
                resultList.add(1);
            } else if (symbolList.get(i) == 1) {
                resultList.add(1);
                resultList.add(0);
            }
        }

        return resultList;
    }


    public static void main(String[] args) {
       int A = 3;
       int B = 0;
        System.out.println(solve(A,B));
    }
}
