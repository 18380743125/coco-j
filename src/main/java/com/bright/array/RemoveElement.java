package com.bright.array;


public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int slow = 0, fast = 0;
        while (fast < n) {
            if (nums[fast] != val) {
                nums[slow++] = nums[fast];
            }
            fast++;
        }
        return slow;
    }
}
