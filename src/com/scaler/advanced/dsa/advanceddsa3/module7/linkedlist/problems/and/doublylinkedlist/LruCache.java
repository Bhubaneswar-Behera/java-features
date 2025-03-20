package com.scaler.advanced.dsa.advanceddsa3.module7.linkedlist.problems.and.doublylinkedlist;

/**
 * Given a running stream of integers, we have to maintain the "m" most recently used elements.
 * In case the current memory is full, in order to insert we have to remove the least recently used element
 * and insert the current data into the memory. (as the most recent item)
 *
 * A = {7,3,9,2,6,10,14,2,10,15,8,16}  m = 5
 * Use Doubly Linked List to maintain the order of the elements.
 * Use HashMap to maintain the address of the elements in the doubly linked list.
 */
//impplement Doubly Link List
class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class LruCache {

    private final int capacity;
    private final DoublyLinkedList doublyLinkedList;
    private final java.util.HashMap<Integer, Node> hashMap;

    public LruCache(int capacity) {
        this.capacity = capacity;
        this.doublyLinkedList = new DoublyLinkedList();
        this.hashMap = new java.util.HashMap<>();
    }

    public void insert(int data) {
        if (hashMap.containsKey(data)) {
            Node node = hashMap.get(data);
            doublyLinkedList.deleteNode(node);
            doublyLinkedList.insertBeforeTail(node);
        } else {
            if (hashMap.size() == capacity) {
                Node head = doublyLinkedList.getHead();
                hashMap.remove(head.data);
                doublyLinkedList.deleteNode(head);
            }
            Node newNode = new Node(data);
            doublyLinkedList.insertBeforeTail(newNode);
            hashMap.put(data, newNode);
        }
    }

    public void print() {
        Node temp = doublyLinkedList.getHead();
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LruCache lruCache = new LruCache(5);
        lruCache.insert(7);
        lruCache.insert(3);
        lruCache.insert(9);
        lruCache.insert(2);
        lruCache.insert(6);
        lruCache.insert(10);
        lruCache.insert(14);
        lruCache.insert(2);
        lruCache.insert(10);
        lruCache.insert(15);
        lruCache.insert(8);
        lruCache.insert(16);
        lruCache.print();
    }
}
