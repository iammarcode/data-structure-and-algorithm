package com.codewithmarco;

import com.codewithmarco.queue.StackWithTwoQueue;

import java.util.*;


public class DataStructureApplication {
    public static void main(String[] args) {

        StackWithTwoQueue queue = new StackWithTwoQueue();

        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);

        queue.pop();
        queue.pop();
        queue.pop();

        System.out.println(queue.peek());
        System.out.println(queue.print());
    }

    public static void revers(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack();
        while (!queue.isEmpty()) {
            var item = queue.remove();
            stack.push(item);
        }

        while (!stack.isEmpty()) {
            var item = stack.pop();
            queue.add(item);
        }
    }
}
