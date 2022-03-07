package com.codewithmarco.queue;

public class LinkedListQueue {
    public class Node {
        private int value;
        private Node next;

        public Node(int item) {
            this.value = item;
            this.next = null;
        }
    }

    private Node front, rear;
    private int size;

    public void enqueue(int item) {
        Node node = new Node(item);
        if (rear == null) {
            this.front = this.rear = node;
        } else {
            rear.next = node;
            rear = node;
        }

        size++;
    }

    public int dequeue() {
        if (front == null) throw new IllegalStateException();
        int removed = front.value;
        front = front.next;
        if (front == null) rear = null;
        size--;
        return removed;
    }

    public int[] toArray() {
        var array = new int[size];
        var index = 0;
        var current = front;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }
}



