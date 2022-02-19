package com.codewithmosh;

import com.codewithmosh.stack.ArrayStack;
import com.codewithmosh.stack.Expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;


public class DataStructureApplication {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

//        stack.pop();

        System.out.println(stack.peek());


    }
}
