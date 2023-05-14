package com.bright.hashtable;

import org.junit.jupiter.api.Test;

public class TestRansomLetter {
    @Test
    public void test() {
        boolean result = RansomLetter.canConstruct("aa", "aab");
        System.out.println(result);
    }
}
