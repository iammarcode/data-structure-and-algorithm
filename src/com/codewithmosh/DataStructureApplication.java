package com.codewithmosh;

import com.codewithmosh.stack.ArrayStack;
import com.codewithmosh.stack.Expression;
import com.codewithmosh.stack.MinStack1;
import com.codewithmosh.stack.MinStack2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;


public class DataStructureApplication {
    public static void main(String[] args) {
        var stack = new MinStack2();

        stack.push(10);
        stack.push(2);
        stack.push(56);
        stack.push(33);
        stack.push(1);

        System.out.println(stack.getMin());

        stack.push(100);

        System.out.println(stack.getMin());

        stack.pop();
        stack.pop();

        System.out.println(stack.getMin());


        System.out.println(stack.top());


    }
}
