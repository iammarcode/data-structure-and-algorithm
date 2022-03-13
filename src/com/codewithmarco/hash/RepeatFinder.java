package com.codewithmarco.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RepeatFinder {
    public Character findFirstNonRepeat(String str) {
        var chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (var c : chars) {
            var count = map.containsKey(c) ? map.get(c) : 0;
            map.put(c, count + 1);
        }

        for (var c : chars) {
            if (map.get(c) == 1) return c;
        }

        return 0;
    }

    public Character findFirstRepeat(String str) {
        var chars = str.toCharArray();
        Set<Character> set = new HashSet<>();
        for (var c : chars) {
            if (set.contains(c)) {
                return c;
            } else {
                set.add(c);
            }
        }

        return Character.MIN_VALUE;
    }
}
