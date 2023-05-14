package com.bright.hashtable;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestTwoSum {
    @Test
    public void test() {
        int[] nums = {2, 7, 11, 15};
        int[] result = TwoSum.twoSum(nums, 9);
        System.out.println(Arrays.toString(result));
    }
}
