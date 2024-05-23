package com.scaler.advanced.dsa.module5.oops.introduction.refvsinstance.two;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 10;
        s1.name = "A";

        Student s2 = new Student();

        Student temp = s1;
        s1 = s2;
        s2 = temp;

        s2.display();

    }
}
