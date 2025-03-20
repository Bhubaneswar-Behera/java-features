package com.scaler.advanced.dsa.advanceddsa3.module7.stacks.implementation.and.basic.problems;

public class StackUsingArrays {
    int A[] = new int[1000];
    int top = -1;

    void push(int x) {
        if (top == 999) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        A[top] = x;
    }
    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(A[top]);
    }
    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int x = A[top];
        top--;
        return x;
    }
    boolean isEmpty() {
        return top == -1;
    }
    int size() {
        return top + 1;
    }
    public static void main(String[] args) {
        StackUsingArrays stack = new StackUsingArrays();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.peek();
        stack.pop();
        stack.peek();
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
    }
}
