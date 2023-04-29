package com.bright.array;

import com.bright.utils.ArrayUtil;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestRemoveElement {
    @Test
    public void test() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int len = RemoveElement.removeElement(nums, 2);
        ArrayUtil<Integer> arrayUtil = new ArrayUtil<>();
        arrayUtil.print(Arrays.stream(nums).boxed().toArray(Integer[]::new), 0, len);
    }
}
