package com.bright.array;

public class SortedSquares {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0, right = n - 1, idx = n - 1;
        int[] result = new int[n];
        while (left <= right) {
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                result[idx--] = nums[right] * nums[right];
                right--;
            } else {
                result[idx--] = nums[left] * nums[left];
                left++;
            }
        }
        return result;
    }
}
