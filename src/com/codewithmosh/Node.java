package com.codewithmosh;

public class Node {
    private int value;
    private Node next;

    public void updateNext(Node node) {
        next = node;
    }

    public void clearNext() {
        next = null;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }
}


