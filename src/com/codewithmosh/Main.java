package com.codewithmosh;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(120);

        System.out.println(list.contains(10));
        System.out.println(Arrays.toString(list.toArray()));



    }
}
