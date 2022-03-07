package com.codewithmarco.queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

// stack [1,2,3]
// q1 [1,2,3]     q1 [3]                 q1 []                     q1 [1,2]
//            ==>          == remove =>            == swap name =>
// q2 []          q2 [1,2]               q2 [1,2]                  q2 []
public class StackWithTwoQueue {
    private Queue<Integer> q1 = new ArrayDeque<>();
    private Queue<Integer> q2 = new ArrayDeque<>();
    private int size;

    public void push(int item) {
        q1.add(item);
        size++;
    }

    public int pop() {
        if (size < 1) throw new IllegalStateException();
        while (q1.size() != 1) {
            q2.add(q1.remove());
        }

        int removed = q1.remove();

        // swap name
        Queue q = q1;
        q1 = q2;
        q2 = q;

        size--;

        return removed;
    }

    public int peek() {
        if (size < 1) throw new IllegalStateException();
        while (q1.size() != 1) {
            q2.add(q1.remove());
        }

        int peeked = q1.remove();
        q2.add(peeked);

        // swap name
        Queue q = q1;
        q1 = q2;
        q2 = q;

        return peeked;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String print() {
        return Arrays.toString(q1.toArray());
    }
}
