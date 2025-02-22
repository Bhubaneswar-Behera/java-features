package com.scaler.advanced.dsa.advanceddsa2.module6.oops.introduction.refvsinstance.four;

public class Client1 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.age = 10;

        Student1 s2 = s1;

        s2.display();
    }
}
