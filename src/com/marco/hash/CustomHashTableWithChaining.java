package com.marco.hash;

import java.util.Arrays;
import java.util.LinkedList;

public class CustomHashTableWithChaining {
    private LinkedList<Entry>[] items = new LinkedList[5];

    public void put(int k, String v) {
        int index = hash(k);
        var bucket = items[index];
        if (bucket == null) {
            LinkedList<Entry> item = new LinkedList<>();
            item.addLast(new Entry(k, v));
            items[index] = item;
        } else {
            for (var entry : bucket) {
                if (entry.key == k) {
                    entry.value = v;
                    return;
                }
            }
            bucket.addLast(new Entry(k, v));
        }
    }

    public String get(int k) {
        int index = hash(k);
        var bucket = items[index];
        if (bucket != null) {
            for (var entry : bucket) {
                if (entry.key == k) {
                    return entry.value;
                }
            }
        }
        return null;
    }

    public void remove(int k) {
        int index = hash(k);
        var bucket = items[index];
        if (bucket != null) throw new IllegalStateException();
        for (var entry : bucket) {
            if (entry.key == k) {
                bucket.remove(entry);
                return;
            }
        }
        throw new IllegalStateException();
    }

    private int hash(int k) {
        return k % items.length;
    }

    @Override
    public String toString() {
        return "CustomHashTable{" +
                "items=" + Arrays.toString(items) +
                '}';
    }

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
}
