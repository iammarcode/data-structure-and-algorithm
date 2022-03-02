package com.codewithmosh;

import com.codewithmosh.queue.ArrayQueue;

import java.util.*;


public class DataStructureApplication {
    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
//        queue.enqueue(6);

        System.out.println(queue.dequeue());

        System.out.println(queue.peek());
//
        System.out.println(queue.dequeue());

        queue.enqueue(9);
//
        System.out.println(queue);

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
