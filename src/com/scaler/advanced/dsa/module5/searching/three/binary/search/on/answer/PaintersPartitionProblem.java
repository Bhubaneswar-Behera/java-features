package com.scaler.advanced.dsa.module5.searching.three.binary.search.on.answer;

import java.util.Arrays;

/**
 * Given 2 integers A and B and an array of integers C of size N.
 * Element C[i] represents the length of ith board.
 * You have to paint all N boards [C0, C1, C2, C3 … CN-1].
 * There are A painters available and each of them takes B units of time to paint 1 unit of the board.
 *
 * Calculate and return the minimum time required to paint all boards under the constraints that any painter will only paint contiguous sections of the board.
 * NOTE:
 * 1. 2 painters cannot share a board to paint.
 *      That is to say, a board cannot be painted partially by one painter, and partially by another.
 * 2. A painter will only paint contiguous boards.
 *  This means a configuration where painter 1 paints boards 1 and 3 but not 2 is invalid.
 * Return the ans % 10000003.
 *
 * Input : A = 2  B = 5  C = [1, 10]        Output : 50
 * Explanation : Possibility 1:- One painter paints both blocks, time taken = 55 units.
 *               Possibility 2:- Painter 1 paints block 1, painter 2 paints block 2, time take = max(5, 50) = 50
 *               There are no other distinct ways to paint boards.
 *                ans = 50 % 10000003
 *
 * Input : A = 10 B = 1  C = [1, 8, 11, 3]  Output : 11
 * Explanation : Each block is painted by a painter so, Painter 1 paints block 1, painter 2 paints block 2, painter 3 paints block 3
 *               and painter 4 paints block 4, time taken = max(1, 8, 11, 3) = 11
 *               ans = 11 % 10000003
 */
public class PaintersPartitionProblem {

    public static int paint(int A, int B, int[] C) {
        long sum = Arrays.stream(C).sum();
        long max = getMax(C);

        int answer = -1;
        long high = sum*B;
        long low = max*B;
        while(low <= high){
            long mid = (low + high)/2;
            int painters = (int) numberOfPainters(C, B, mid);
            if(painters <= A) {
                answer = (int) (mid % 10000003);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return  answer % 10000003;
    }
    private static long numberOfPainters(int[] C, long B, long mid){
        long numberOfPainters = 1;
        long timeLeft = mid;
        for(int i = 0; i < C.length; i++){
            long timeRequired = C[i]*B;
            if( timeRequired > mid) return -1;
            if(timeRequired <= timeLeft){
                timeLeft = timeLeft - timeRequired;
            } else {
                numberOfPainters++;
                timeLeft = mid - timeRequired;
            }
        }
        return numberOfPainters;
    }

    public static int getMax(int[] A){
        int max = Integer.MIN_VALUE;
        for (int i: A) {
            max = Math.max(max,i);
        }
        return max;
    }
    public static void main(String[] args) {
        //Input
        int A = 2;
        int B = 5;
        int[] C = {1, 10};
        System.out.println(paint(A,B,C));
    }
}
