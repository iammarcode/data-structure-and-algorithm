package com.marco.hash;

import java.util.Arrays;
import java.util.HashMap;

public class FindMostFrequent {
    // sorting + for loops: O(n log(n))
    public static int mostFrequent1(int[] arr) {
        Arrays.sort(arr);

        int maxCount = 1;
        int currCount = 1;
        int res = arr[0];

        // O(n)
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currCount++;
            } else {
                if (currCount > maxCount) {
                    maxCount = currCount;
                    res = arr[i - 1];
                }

                currCount = 1;
            }
        }

        if (currCount > maxCount) {
            maxCount = currCount;
            res = arr[arr.length - 1];
        }
        return res;
    }

    // hash table: O(n)
    public static int mostFrequent2(int[] arr) {
        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int key : arr) {
            if (hash.containsKey(key)) {
                var prevCount = hash.get(key);
                prevCount++;
                hash.put(key, prevCount);
            } else {
                hash.put(key, 1);
            }
        }

        int maxCount = 0, res = 0;
        for (var entry : hash.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                res = entry.getKey();
            }
        }

        return res;
    }
}
