package com.scaler.advanced.dsa.advanceddsa2.module6.sorting.quicksort.comparator.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * You are developing a feature for Zomato that helps users find the nearest restaurants to their current location. It uses GPS to determine the user's
 * location and has access to a database of restaurants, each with its own set of coordinates in a two-dimensional
 * space representing their geographical location on a map.
 * The goal is to identify the "B" closest restaurants to the user, providing a quick and convenient
 * way to choose where to eat.
 * Given a list of restaurant locations, denoted by A (each represented by its x and y coordinates on a map), and an integer B representing the number of closest restaurants to the user. The user's current location is assumed to be at the origin (0, 0).
 * Here, the distance between two points on a plane is the Euclidean distance.
 * You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in.)
 *
 * NOTE: Euclidean distance between two points P1(x1, y1) and P2(x2, y2) is sqrt( (x1-x2)2 + (y1-y2)2).
 *
 *Input :
 * A = [
 *        [1, 3],
 *        [-2, 2]
 *      ]
 *  B = 1
 *  Output 1: [ [-2, 2] ]
 * Explanation : The Euclidean distance will be sqrt(10) for point [1,3] and sqrt(8) for point [-2,2].
 *  So one closest point will be [-2,2].
 *
 * Input 2:
 * A = [
 *        [1, -1],
 *        [2, -1]
 *      ]
 *  B = 1
 * Output 2: [ [1, -1] ]
 * Explanation : The Euclidean distance will be sqrt(2) for point [1,-1] and sqrt(5) for point [2,-1].
 * So one closest point will be [1,-1].
 *
 *
 */

class DistanceComparator implements Comparator<ArrayList<Integer>> {
    @Override
    public int compare(ArrayList<Integer> P1, ArrayList<Integer> P2) {
        int d1 = P1.get(0) * P1.get(0) + P1.get(1) * P1.get(1);
        int d2 = P2.get(0) * P2.get(0) + P2.get(1) * P2.get(1);
        return d1 - d2;
    }
}
public class BClosestPointsToOrigin {
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {
        Collections.sort(A, new DistanceComparator());

        ArrayList<ArrayList<Integer>> resultList = new ArrayList<>();
        for (int i = 0; i < B; i++) {
            resultList.add(A.get(i));
        }

        return resultList;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(3);

        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(-2);
        a2.add(2);

        A.add(a1);
        A.add(a2);

        int B  = 1;

        System.out.println(solve(A,B));
    }
}
