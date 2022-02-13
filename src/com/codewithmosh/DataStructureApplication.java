package com.codewithmosh;

import com.codewithmosh.stack.Expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;


public class DataStructureApplication {
    public static void main(String[] args) {
        String testStr = "((<1> + <2>))[a]";


        Expression exp = new Expression();
        System.out.println(exp.isBalanced(testStr));





    }
}
