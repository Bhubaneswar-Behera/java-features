package com.scaler.advanced.dsa.module5.oops.construcor.inheritance.polymorphism.eight;

public class Client {
    public static void main(String[] args) {
        C obj = new C();
        System.out.println(obj.d1);
        System.out.println(obj.d);
        obj.fun1();
        obj.fun();
        obj.sfun();
    }
}
