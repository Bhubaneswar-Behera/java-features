package com.scaler.advanced.dsa.module5.contest;

class Parent{
    Parent(){
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent {
    Child(){
        System.out.println("Child Constructor");
    }
}
public class Test {
    public static void main(String[] args) {
        Child c = new Child();
    }
}
