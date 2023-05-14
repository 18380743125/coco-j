package com.bright.hashtable;

import org.junit.jupiter.api.Test;

public class TestHappyNum {
    @Test
    public void test1() {
        boolean happy = HappyNum.isHappy(19);
        System.out.println(happy);
    }

    @Test
    public void test2() {
        boolean happy = HappyNum.isHappy(2);
        System.out.println(happy);
    }
}
