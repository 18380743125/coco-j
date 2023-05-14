package com.bright.hashtable;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> cache = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (cache.containsKey(nums[i])) {
                return new int[]{cache.get(nums[i]), i};
            }
            cache.put(target - nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
