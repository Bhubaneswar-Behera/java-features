package com.scaler.advanced.dsa.advanceddsa2.module6.oops.construcor.inheritance.polymorphism.five;

public class Client {
    public static void main(String[] args) {
        P obj = new P();
        System.out.println(obj.d1);//10
        System.out.println(obj.d);//100
        obj.fun1();
        obj.fun();
        obj.sfun();
    }
}
