package com.scaler.advanced.dsa.module5.sorting.quicksort.comparator.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Given an array A of N integers. Sort the array in increasing order of the value at the tens place digit of every number.
 * If a number has no tens digit, we can assume value to be 0.
 * If 2 numbers have same tens digit, in that case number with max value will come first
 * Solution should be based on comparator.
 *
 * Input : A = [15, 11, 7, 19]  Output : [7, 19, 15, 11]
 * Explanation :
 * The sorted order is [7, 19, 15, 11]. The tens digit of 7 is 0,
 * and that of 19, 15 and 11 is 1.
 *
 * Input : A = [2, 24, 22, 19]  Output : [2, 19, 24, 22]
 * Explanation:
 * The sorted order is [2, 19, 24, 22]. The tens digit of 2 is 0,
 * that of 19 is 1 and that of 22 and 24 is 2.
 *
 */
class TenthPlaceComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer A, Integer B) {
        int aTenthPlace = (A / 10) % 10;
        int bTenthPlace = (B / 10) % 10;

        if (aTenthPlace == bTenthPlace) {
            return B - A;
        }
        return aTenthPlace - bTenthPlace;
    }
}
public class TensDigitSorting {

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        Collections.sort(A, new TenthPlaceComparator());
        return A;
    }
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        //2, 24, 22, 19
        integerArrayList.add(2);
        integerArrayList.add(24);
        integerArrayList.add(22);
        integerArrayList.add(19);
        System.out.println(solve(integerArrayList));
    }
}
