package com.scaler.advanced.dsa.module4.bit.maniplutaion.one;

/**
 * Alex and Sam are good friends. Alex is doing a lot of programming these days.
 * He has set a target score of A for himself.
 * Initially, Alex's score was zero. Alex can double his score by doing a question,
 * or Alex can seek help from Sam for doing questions that will contribute 1 to Alex's score. Alex wants his score to be precisely A. Also, he does not want to take much help from Sam.
 *
 * Find and return the minimum number of times Alex needs to take help from Sam to achieve a score of A.
 *
 * Input : A = 5 Output : 2
 * Explanation :
 * Initial score : 0
 * Takes help from Sam, score : 1
 * Alex solves a question, score : 2
 * Alex solves a question, score : 4
 * Takes help from Sam, score: 5
 *
 * Input : A = 3 Output : 2
 * Explanation :
 * Initial score : 0
 * Takes help from Sam, score : 1
 * Alex solves a question, score : 2
 * Takes help from Sam, score : 3
 */
public class HelpFromSam {
    public static int solve(int A) {
        int count = 0;
        while (A > 0) {
            if((A & 1) == 1){
                count++;
            }
            A = A>>1;
        }
        return count;
    }
    public static int solve2(int A){
        int answer = 0;
        for (int i = 0; i < 32 ; i++) {
            if((A & (1<<i)) !=0 ) {
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int A = 5;
        System.out.println(solve(A));
        int B = 17;
        System.out.println(solve2(B));
    }
}
