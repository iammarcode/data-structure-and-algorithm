package com.marco.queue;

import java.util.Arrays;

// [1,3,5,7] insert 2
// [1,2,5,7] from front
// [1,3,5,7]
// [1,3,3,5,7]
public class PriorityQueue {
    private int[] items = new int[5];
    private int count;

    public void enqueue(int item) {
        if (count >= items.length) throw new IllegalStateException();
        int i;
        for (i = count - 1; i >= 0; i--) {
            if (item < items[i]) {
                items[i + 1] = items[i];
            } else {
                break;
            }
        }
        items[i + 1] = item;
        count++;
    }

    @Override
    public String toString() {
        return "PriorityQueue{" +
                "items=" + Arrays.toString(items) +
                ", count=" + count +
                '}';
    }
}
