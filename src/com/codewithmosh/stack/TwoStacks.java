package com.codewithmosh.stack;

// TowStack: A space efficient implementation
public class TwoStacks {
    private int[] items;
    private int count1, count2, size;

    public TwoStacks(int n) {
        items = new int[n];
        size = n;
        count1 = -1;
        count2 = size;
    }

    public void push1(int item) {
        if (count2 > count1 + 1) {
            items[++count1] = item;
        } else {
            throw new StackOverflowError();
        }
    }

    public void push2(int item) {
        if (count2 > count1 + 1) {
            items[--count2] = item;
        } else {
            throw new StackOverflowError();
        }
    }

    public int pop1() {
        if (count1 > -1) {
            int x = items[count1];
            count1--;
            return x;
        } else {
            throw new StackOverflowError();
        }
    }

    public int pop2() {
        if (count2 < size) {
            int x = items[count2];
            count2--;
            return x;
        } else {
            throw new StackOverflowError();
        }
    }

}
