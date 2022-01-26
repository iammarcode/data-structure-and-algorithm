package com.codewithmosh;


import java.util.NoSuchElementException;

public class LinkedList {
    public class Node {
        private int value;
        private Node next;

        public Node(int item) {
            this.value = item;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        var node = new Node(item);
        if (first == null) first = last = node;
        else {
            last.next = node;
            last = node;
        }

        size++;
    }

    public void addFirst(int item) {
        var node = new Node(item);
        if (first == null) first = last = node;
        else {
            node.next = first;
            first = node;
        }

        size++;
    }

    public int indexOf(int item) {
        int index = 0;
        Node current = first;
        while (current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {

        return indexOf(item) != -1;
    }

    public void removeFirst() {
        if (isEmpty()) throw new NoSuchElementException();

        if (first == last)
            first = last = null;
        else {
            var second = first.next;
            first.next = null;
            first = second;
        }

        size--;
    }


    public void removeLast() {
        if (isEmpty()) throw new NoSuchElementException();
        if (first == last)
            first = last = null;
        else {
            var previous = getPrevious(last);
            last = previous;
            previous.next = null;
        }

        size--;
    }

    public Node getPrevious(Node last) {
        var current = first;
        while (current != null) {
            if (current.next == last) return current;
            current = current.next;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int[] toArray() {
        var array = new int[size];
        var index = 0;
        var current = first;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public void reverse() {
//      first                   last
//      [10 <- 20  <- 30  40 -> 50]
        if (isEmpty()) return;

        var previous = first;
        var current = first.next;

        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;
    }

    // [1 -> 2 -> 3 -> 4 -> 5]
    //                 k
    //                 size-k
    public int findKthFromTheEnd(int k) {
        Node curr = first;


        if (k > size) return 0;


        for (int i = 1; i < size - k + 1; i++) {
            curr = curr.next;
        }

        return curr.value;
    }


}
