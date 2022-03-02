package com.codewithmosh.queue;

import java.util.Arrays;

// circular array queue
// [0,0,30,40,50]
//      F      R
public class ArrayQueue {
    private int front, rear, count;
    private int[] items;

    public ArrayQueue(int capacity) {
        items = new int[capacity];
    }

    public void enqueue(int item) {
        if (count == items.length) {
            throw new StackOverflowError();
        }
        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }

    public int dequeue() {
        var item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }

    public int peek() {
        if (rear == 0) {
            return items[items.length - 1];
        }
        return items[rear - 1];
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "front=" + front +
                ", rear=" + rear +
                ", count=" + count +
                ", items=" + Arrays.toString(items) +
                '}';
    }
}
