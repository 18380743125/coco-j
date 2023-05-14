package com.bright.hashtable;

import org.junit.jupiter.api.Test;

public class TestAnagram {
    @Test
    public void test1() {
        boolean is = Anagram.isAnagram("anagram", "nagaram");
        System.out.println(is);
    }

    @Test
    public void test2() {
        boolean is = Anagram.isAnagram("rat", "car");
        System.out.println(is);
    }
}
