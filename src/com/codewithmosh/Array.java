package com.codewithmosh;

public class Array {
    private int count;
    private int[] items;

    public Array(int length) {
        this.items = new int[length];
    }

    public void insert(int item) {
        if (count >= items.length) {
            var newItems = new int[items.length * 2];
            for (var i = 0; i < items.length; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int position) {
        if (position < 0 || position >= count) {
            throw new IllegalArgumentException();
        }

        for (int i = position; i < count; i++) {
            items[i] = items[i+1];
        }

        count--;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
    
    public int max() {
        int max = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] > max) {
                max = items[i];
            }
        }
        return max;
    }





    public int getLength() {
        return items.length;
    }

    public int getCount() {
        return count;
    }
}
