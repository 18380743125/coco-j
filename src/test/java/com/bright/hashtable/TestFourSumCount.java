package com.bright.hashtable;

import org.junit.jupiter.api.Test;

public class TestFourSumCount {
    @Test
    public void test() {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{-2, -1};
        int[] nums3 = new int[]{-1, 2};
        int[] nums4 = new int[]{0, 2};
        int count = FourSumCount.fourSumCount(nums1, nums2, nums3, nums4);
        System.out.println(count);
    }
}
