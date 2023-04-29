package com.bright.array;

public class MinSubArrLen {
    public static int minSubArrLen(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = 0;
        int sum = 0, result = Integer.MAX_VALUE;
        while (right < n) {
            sum += nums[right];
            while (sum >= target) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left++];
            }
            right++;
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
