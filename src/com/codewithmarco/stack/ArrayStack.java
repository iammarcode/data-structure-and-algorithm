package com.codewithmarco.stack;

import java.util.Arrays;

// [10, 20, 30, 40]
//      count
public class ArrayStack {
    private int[] items = new int[5];
    private int count;

    public void push(int item) {
        items[count++] = item;
    }

    public int pop() {
        if (count == 0) throw new IllegalStateException();
        return items[--count];
    }

    public int peek() {
        if (count == 0) throw new IllegalStateException();
        return items[count - 1];
    }

    @Override
    public String toString() {
        var content = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content);
    }
}
