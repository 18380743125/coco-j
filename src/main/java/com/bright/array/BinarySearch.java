package com.bright.array;

public class BinarySearch {
    /**
     * 方式一：包含 right
     *
     * @param nums   查找范围
     * @param target 目标值
     * @return 目标值索引
     */
    public static int findIndex1(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) return -1;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = left + ((right - left) >>> 1);
            if (target == nums[mid]) return mid;
            if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    /**
     * 方式二：不包含 right
     *
     * @param nums   查找范围
     * @param target 目标值
     * @return 目标值索引
     */
    public static int findIndex2(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) return -1;
        int left = 0;
        int right = n;
        while (left < right) {
            int mid = left + ((right - left) >>> 1);
            if (nums[mid] == target) return mid;
            if (target < nums[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
