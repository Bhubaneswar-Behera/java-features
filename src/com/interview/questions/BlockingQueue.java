package com.interview.questions;

import java.util.LinkedList;
import java.util.List;

/**
 * RSA - 29-April-2024
 *
 */
public class BlockingQueue<E> {
    private List<E> queue = new LinkedList<>();
    private int limit = 10;
    public BlockingQueue(int limit) {
        this.limit = limit;
    }

    // enqueue method that throws Exception
    // when you try to insert after the limit
    public synchronized void enqueue(E item)
            throws InterruptedException
    {
        while (this.queue.size() == this.limit) {
            wait();
        }
        if (this.queue.size() == 0) {
            notifyAll();
        }
        this.queue.add(item);
    }

    // dequeue methods that throws Exception
    // when you try to remove element from an
    // empty queue
    public synchronized E dequeue()
            throws InterruptedException
    {
        while (this.queue.size() == 0) {
            wait();
        }
        if (this.queue.size() == this.limit) {
            notifyAll();
        }

        return this.queue.remove(0);
    }


    public static void main(String[] args) {

    }
}
