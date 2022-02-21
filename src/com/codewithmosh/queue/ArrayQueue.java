package com.codewithmosh.queue;

import java.util.Arrays;

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
        items[rear++] = item;
        count++;
    }

    public int dequeue() {
        var item = items[front];
        items[front++] = 0;
        count--;
        return item;
    }

    public int peek() {
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
