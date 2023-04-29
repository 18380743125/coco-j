package com.bright.array;

import org.junit.jupiter.api.Test;

public class TestMinSubArrLen {
    @Test
    public void test() {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int len = MinSubArrLen.minSubArrLen(nums, 3);
        System.out.println(len);
    }
}
