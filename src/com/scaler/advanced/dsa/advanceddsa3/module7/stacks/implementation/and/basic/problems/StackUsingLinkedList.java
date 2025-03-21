package com.scaler.advanced.dsa.advanceddsa3.module7.stacks.implementation.and.basic.problems;

public class StackUsingLinkedList {
    Node head;
    void push(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    int peek() {
        if (head == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return head.data;
    }
    int pop() {
        if (head == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        int val = head.data;
        head = head.next;
        return val;
    }
}
