package com.bright.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestSortedSquares {
    @Test
    public void test() {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] arr = SortedSquares.sortedSquares(nums);
        System.out.println(Arrays.toString(arr));
    }
}
