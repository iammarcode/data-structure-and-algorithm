package com.codewithmosh;

public class LinkedList {
    private Node first;
    private Node last;

    public void addFirst(Node node) {
        first.updateNext(node);
    }

    public void addLast(Node node) {
        last.updateNext(node);
    }

    public void deleteFirst() {
        first.clearNext();
    }

    public void deleteLast() {
        last.clearNext();
    }

    public boolean contains(Node node) {
        if (first.getValue() == node.getValue()) {
            return true;
        } else {

        }
    }

}
