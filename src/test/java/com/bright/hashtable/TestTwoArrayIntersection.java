package com.bright.hashtable;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestTwoArrayIntersection {
    @Test
    public void test1() {
        int[] num1 = new int[]{1, 2, 2, 1};
        int[] num2 = new int[]{2, 2};
        int[] result = TwoArrayIntersection.intersection(num1, num2);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void test2() {
        int[] num1 = new int[]{4, 9, 5};
        int[] num2 = new int[]{9, 4, 9, 8, 4};
        int[] result = TwoArrayIntersection.intersection(num1, num2);
        System.out.println(Arrays.toString(result));
    }
}
