package com.codewithmosh;

import com.codewithmosh.queue.PriorityQueue;

import java.util.*;


public class DataStructureApplication {
    public static void main(String[] args) {

        PriorityQueue queue = new PriorityQueue();

        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(3);
        queue.enqueue(6);
        queue.enqueue(2);
//        queue.enqueue(4);

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
