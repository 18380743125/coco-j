package com.bright.hashtable;

import java.util.HashMap;
import java.util.Map;

public class FourSumCount {
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        int temp = 0;
        int result = 0;
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                temp = num1 + num2;
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }
        }
        for (int num3 : nums3) {
            for (int num4 : nums4) {
                temp = num3 + num4;
                if (map.containsKey(-temp)) {
                    result += map.get(-temp);
                }
            }
        }
        return result;
    }
}
