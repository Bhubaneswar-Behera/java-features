package com.scaler.firstday.problem.solving;

public class CountPrimeNumbers {
    public int solve(int A){
        int count = 0;

        for (int  i = 0; i <= A ;i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private int countFactors(int A){
        int count = 0;


        for (int i = 1 ; i <= A/i ; i++) {
            if(A % i == 0){

                count++;
                if(i != A/i){
                    count++;

                }
            }
        }

        return count;
    }

    private boolean isPrime(int A){
        return countFactors(A) == 2 ? true : false;
    }

    public static void main(String[] args) {
        CountPrimeNumbers countPrimeNumbers = new CountPrimeNumbers();
        System.out.println(countPrimeNumbers.solve(19));
    }
}
