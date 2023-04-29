package com.bright.array;

import com.bright.utils.ArrayUtil;
import org.junit.jupiter.api.Test;

public class TestGenerateMatrix {
    @Test
    public void test() {
        int n = 5;
        Integer[][] generate = GenerateMatrix.generate(n);
        ArrayUtil<Integer> arrayUtil = new ArrayUtil<>();
        arrayUtil.print(generate, 0, n);
    }
}
