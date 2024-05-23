package com.scaler.advanced.dsa.module5.oops.introduction.refvsinstance.four;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 10;
        s1.name = "A";

        Student s2 = new Student();

        String tempName = s1.name;
        s1.name = s2.name;
        s2.name = tempName;

        s1.display();

    }
}
