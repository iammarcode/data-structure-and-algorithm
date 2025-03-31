package com.marco.stack;

// array solution
public class MinStack1 {
    private int count;
    private int[] items, minTrack;

    public MinStack1(int len) {
        items = new int[len];
        minTrack = new int[len];
    }

    public void push(int item) {
        if (count == 0) {
            minTrack[count] = 0;
        } else {
            if (items[minTrack[count - 1]] > item) {
                minTrack[count] = count;
            } else {
                minTrack[count] = minTrack[count - 1];
            }
        }
        items[count++] = item;
    }

    public int pop() {
        if (count == 0) throw new IllegalStateException();
        return items[--count];
    }

    public int min() {
        return items[minTrack[count - 1]];
    }
}
