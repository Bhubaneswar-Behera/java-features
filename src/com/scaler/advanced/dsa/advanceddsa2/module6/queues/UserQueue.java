package com.scaler.advanced.dsa.advanceddsa2.module6.queues;

import java.util.Stack;

/**
 * Implement a First In First Out (FIFO) queue using stacks only.
 *
 * The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).
 *
 * Implement the UserQueue class:
 *
 * void push(int X) : Pushes element X to the back of the queue.
 * int pop() : Removes the element from the front of the queue and returns it.
 * int peek() : Returns the element at the front of the queue.
 * boolean empty() : Returns true if the queue is empty, false otherwise.
 * NOTES:
 *
 * You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
 * Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.
 *
 * Example :
 * Input :
 *  1) UserQueue()
 *  2) push(20)
 *  3) empty()
 *  4) peek()
 *  5) pop()
 *  6) empty()
 *  7) push(30)
 *  8) peek()
 *  9) push(40)
 *  10) peek()
 * Output :
 * false
 *  20
 *  20
 *  true
 *  30
 *  30
 * Explanation :
 *  Queue => 20
 *  Queue => -
 *  Queue => 30
 *  Queue => 30, 40
 *
 *
 * Input 2:
 *  1) UserQueue()
 *  2) push(10)
 *  3) push(20)
 *  4) push(30)
 *  5) pop()
 *  6) pop()
 *  Output :
 *   10
 *   20
 * Explanation :
 *  Queue => 10
 *  Queue => 10, 20
 *  Queue => 10, 20, 30
 *  Queue => 20, 30
 *  Queue => 30
 */
public class UserQueue {
    private static Stack<Integer> stack1;
    private static Stack<Integer> stack2;
    /** Initialize your data structure here. */
    UserQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /** Push element X to the back of queue. */
    static void push(int X) {
        stack1.push(X);
    }

    /** Removes the element from in front of queue and returns that element. */
    static int pop() {
        if (empty()) {
            throw new RuntimeException("Queue is empty.");
        }

        // If stack2 is empty, transfer all elements from stack1 to stack2
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        // Pop the element from stack2, which is the front of the queue
        return stack2.pop();
    }

    /** Get the front element of the queue. */
    static int peek() {
        if (empty()) {
            throw new RuntimeException("Queue is empty.");
        }

        // If stack2 is empty, transfer all elements from stack1 to stack2
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        // Return the top element from stack2 without removing it
        return stack2.peek();
    }

    /** Returns whether the queue is empty. */
    static boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {

    }
}
