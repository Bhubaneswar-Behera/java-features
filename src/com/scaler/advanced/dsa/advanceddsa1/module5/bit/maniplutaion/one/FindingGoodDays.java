package com.scaler.advanced.dsa.advanceddsa1.module5.bit.maniplutaion.one;

/**
 * Alex has a cat named Boomer. He decides to put his cat to the test for eternity.
 * He starts on day 1 with one stash of food unit, every next day, the stash doubles.
 * If Boomer is well behaved during a particular day, only then she receives food worth equal to the stash produced on that day.
 * Boomer receives a net worth of A units of food. What is the number of days she received the stash?
 *
 * Example :
 * Input : A = 5 Output : 2
 * Explanation : To eat a total of 5 units of food, Boomer behaved normally on Day 1 and on the Day 3.
 *
 * Input : A = 8 Output : 1
 * Explanation : To eat a total of 8 units of food, Boomer behaved normally only on day 4.
 */
public class FindingGoodDays {

    public static int solve(int A) {
        int answer = 0;
        while (A>0) {
            if((A & 1) > 0 ){
                answer++;
            }
            A = A >> 1;
        }
        return answer;
    }
    public static void main(String[] args) {
        int A = 5;
        System.out.println(solve(A));
    }
}
