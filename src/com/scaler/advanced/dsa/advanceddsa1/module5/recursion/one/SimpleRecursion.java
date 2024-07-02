package com.scaler.advanced.dsa.advanceddsa1.module5.recursion.one;

/**
 * What will be the output of following program ?
 *
 */
public class SimpleRecursion {
    public static int bar(int x , int y){
        if(y== 0){
            return 0;
        }
        return (x+ bar(x,y-1));
    }

    public static int foo(int x , int y){
        if(y== 0){
            return 1;
        }
        return bar(x, foo(x,y-1));
    }

    public static void main(String[] args) {
        System.out.println(foo(3,5));
    }
}
