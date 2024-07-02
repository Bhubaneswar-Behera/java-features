package com.scaler.advanced.dsa.advanceddsa1.module5.maths.one.modular.arithmetic.and.gcd;

public class Main {

    public static int pairSumDivisibleByMN(int[] A, int B) {
        int n = A.length;
        int answer = 0;
        int[] frequency = new int[n];

        for (int i = 0; i < n; i++) {
            int value= A[i] % B;
            int partner = (B - value)%B;

            answer = (answer + frequency[partner]) % 1000000007;
            frequency[value]++;
        }
        return answer;
    }

    public static int gcd(int A, int B) {
       if (B == 0){
           return A;
       }

       return gcd(B , A % B);
    }





    public static int cpFact(int A, int B) {
        int gcd = gcd(A,B);
        if (gcd == 1) {
            return A;
        }
        return cpFact(A/gcd , B);
    }

    public static int divisiorGame(int A, int B, int C){
        int answer  =0;
        int lcm = B * C / gcd(B,C);
        answer = Math.floorDiv(A,lcm);

        return answer;
    }


    public static void main(String[] args) {
        int A = 12;
        int B = 3;
        int C = 2;
        System.out.println(divisiorGame(A,B,C));
    }
}
