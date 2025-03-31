package com.marco.hash;

import java.util.HashMap;
import java.util.Map;

public class TowSum {
    // O(n^2)
    public static int[] findTowSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

            }
        }
        return new int[]{};
    }

    // O(n)
    public static int[] findTowSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
