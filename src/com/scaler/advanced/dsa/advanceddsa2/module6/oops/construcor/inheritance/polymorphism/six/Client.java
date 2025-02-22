package com.scaler.advanced.dsa.advanceddsa2.module6.oops.construcor.inheritance.polymorphism.six;

public class Client {
    public static void main(String[] args) {
        P obj = new C();
        System.out.println(obj.d1);
        System.out.println(obj.d);
        obj.fun1();
        obj.fun();
        obj.sfun();
    }
}
