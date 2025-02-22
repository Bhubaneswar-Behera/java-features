package com.scaler.advanced.dsa.advanceddsa2.module6.oops.introduction.refvsinstance.three;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 10;
        s1.name = "A";

        Student s2 = new Student();

        int tempAge = s1.age;
        s1.age = s2.age;
        s2.age = tempAge;

        s2.display();

    }
}
