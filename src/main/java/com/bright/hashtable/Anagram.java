package com.bright.hashtable;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] record = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            record[sc - 'a']++;
            record[tc - 'a']--;
        }
        for (int value : record) {
            if (value != 0) return false;
        }
        return true;
    }
}
