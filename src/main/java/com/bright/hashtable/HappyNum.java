package com.bright.hashtable;

import java.util.HashSet;
import java.util.Set;

public class HappyNum {
    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = getNextNum(n);
        }
        return n == 1;
    }

    public static int getNextNum(int n) {
        int res = 0;
        while (n != 0) {
            int digit = n % 10;
            n /= 10;
            res += digit * digit;
        }
        return res;
    }
}
