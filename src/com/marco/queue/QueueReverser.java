package com.marco.queue;

import java.util.Arrays;
import java.util.Stack;

public class QueueReverser {
    private int front, rear, count;
    private int[] items;

    public QueueReverser(int capacity) {
        items = new int[capacity];
    }

    public void enqueue(int item) {
        if (count >= items.length) {
            resize();
        }

        items[count++] = item;
    }

    public void resize() {
        int[] newItems = new int[items.length * 2];
        for (int i = 0; i < items.length; i++) {
            newItems[i] = items[i];
        }
        items = newItems;
    }

    public void reverse(int k) {
        if (k > count) throw new IllegalStateException();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(items[i]);
        }

        for (int i = 0; i < k; i++) {
            items[i] = stack.pop();
        }
    }

    @Override
    public String toString() {
        return "QueueReverser{" +
                "front=" + front +
                ", rear=" + rear +
                ", count=" + count +
                ", items=" + Arrays.toString(items) +
                '}';
    }
}
