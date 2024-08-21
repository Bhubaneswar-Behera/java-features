package com.scaler.advanced.dsa.advanceddsa2.module6.sorting.quicksort.comparator.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Given an array with N objects colored red, white, or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 * We will represent the colors as,
 *
 * red -> 0
 * white -> 1
 * blue -> 2
 *
 * Note: Using the library sort function is not allowed.
 *
 * Input  : A = [0, 1, 2, 0, 1, 2]  Output : [0, 0, 1, 1, 2, 2]
 * Explanation : [0, 0, 1, 1, 2, 2] is the required order.
 *
 * Input : A = [0]                  Output : [0]
 * Explanation : [0] is the required order
 */

class ColorComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer A, Integer B) {
        return A - B;
    }
}
public class SortByColor {

    public static ArrayList<Integer> sortColors(ArrayList<Integer> A) {
        Collections.sort(A , new ColorComparator());
        return A;
    }
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(0);
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(0);
        integerArrayList.add(1);
        integerArrayList.add(2);

        System.out.println(sortColors(integerArrayList));
    }
}
