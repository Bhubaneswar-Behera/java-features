package com.scaler.advanced.dsa.advanceddsa1.module5.bit.maniplutaion.one;

public class Main {
    public static void main(String[] args) {
        int a = 11;//1011
        int b = 10;//1010
        //System.out.println(a|(1<<2));
        //System.out.println(a);
        //System.out.println(a & 1);
        //System.out.println(b & 1);
        //System.out.println(a&a);
        //System.out.println(a&0);
        //System.out.println(a^a);

        //System.out.println(a | 0);
        //System.out.println(b | b);

        int A = 5;
        int B = 2;
        System.out.println(1<<B);

        //System.out.println(checkBit(A,B));
    }
    public static int checkBit(int A, int B) {

        if((A & (1<<B)) >0){
            return 1;
        }
        return 0;
    }

    public static int count1Bit(int A){
        int count = 0;

        while (A > 0) {
            if((A & 1) > 0){
                count++;
            }
            A = A >> 1;
        }
        return count;
    }
}
