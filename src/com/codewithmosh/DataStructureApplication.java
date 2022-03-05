package com.codewithmosh;

import com.codewithmosh.queue.LinkedListQueue;
import com.codewithmosh.queue.PriorityQueue;
import com.codewithmosh.queue.QueueReverser;

import java.util.*;


public class DataStructureApplication {
    public static void main(String[] args) {

        LinkedListQueue queue = new LinkedListQueue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.dequeue();
        queue.dequeue();

        System.out.println(Arrays.toString(queue.toArray()));



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
