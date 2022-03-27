package com.codewithmarco.hash;

import java.util.Arrays;
import java.util.LinkedList;

public class CustomHashTableWithLinearProbing {
    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Entry{" +
                    "key=" + key +
                    ", value='" + value + '\'' +
                    '}';
        }
    }

    private int size = 5;
    private int count;
    private Entry[] items = new Entry[size];

    public void put(int k, String v) {
        if (count == size) throw new IllegalStateException();

        var index = hash(k);
        var entry = new Entry(k, v);
        if (items[index] == null) {
            items[index] = entry;
        } else {
            var validIndex = linearProbing(index);
            items[validIndex] = entry;
        }
        count++;
    }

    public String get(int k) {
        for (var item : items) {
            if (item.key == k) return item.value;
        }

        return null;
    }

    public void remove(int k) {
        for (int i = 0; i < size; i++) {
            if (items[i] != null && items[i].key == k) {
                items[i] = null;
                count--;
                return;
            }
        }

        throw new IllegalStateException();

    }

    private int hash(int k) {
        return k % items.length;
    }

    private int linearProbing(int current) {
        var found = false;
        while (items[current] != null && current <= size) {
            current++;
        }
        if (current <= size) return current;

        while (items[current] != null && current >= 0) {
            current--;
        }
        if (current >= 0) return current;

        throw new IllegalStateException();
    }

    @Override
    public String toString() {
        return "CustomHashTable{" +
                "items=" + Arrays.toString(items) +
                '}';
    }
}
