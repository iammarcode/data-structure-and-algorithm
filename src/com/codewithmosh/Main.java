package com.codewithmosh;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();



        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.addLast(70);

        var res = list.findKthFromTheEnd(4);

        System.out.println(res);

        var array = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}
