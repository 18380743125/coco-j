package com.bright.array;

import org.junit.jupiter.api.Test;

public class TestBinarySearch {
    @Test
    public void test() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int idx1 = BinarySearch.findIndex1(nums, 9);
        int idx2 = BinarySearch.findIndex2(nums, 9);
        System.out.println("findIndex1：" + idx1);
        System.out.println("findIndex2：" + idx2);
    }
}
