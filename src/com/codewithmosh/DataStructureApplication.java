package com.codewithmosh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;


public class DataStructureApplication {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek());
    }
}
