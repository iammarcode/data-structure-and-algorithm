package com.codewithmosh.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {
    private final List<Character> leftBrackets = Arrays.asList('(', '{', '[', '<');
    private final List<Character> rightBrackets = Arrays.asList(')', '}', ']', '>');

    public boolean isBalanced (String input) {
        var stack = new Stack<Character>();

        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch)) stack.push(ch);
            if (isRightBracket(ch)) {
                if (stack.isEmpty()) return false;

                Character top = stack.pop();
                if (rightBrackets.indexOf(ch) != leftBrackets.indexOf(top)) return false;
            };
        }

        return stack.isEmpty();
    }

    private boolean isLeftBracket(char ch) {
        return leftBrackets.contains(ch);
    }

    private boolean isRightBracket(char ch) {
        return rightBrackets.contains(ch);
    }
}
