package com.codewithmosh.queue;

import java.util.Stack;

//queue [1,2,3,6,7]
//stack1 [6,7] enqueue
//stack2 [3,2,1] dequeue
public class QueueWithTwoStacks {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int item) {
        stack1.push(item);
    }

    public int dequeue() {
        if (isEmpty()) throw new IllegalStateException();
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    private boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
