package com.bright.hashtable;

import java.util.HashMap;
import java.util.Map;

public class RansomLetter {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        for (int j = 0; j < ransomNote.length(); j++) {
            char ch = ransomNote.charAt(j);
            if (map.getOrDefault(ch, 0) == 0) {
                return false;
            }
            map.put(ch, map.get(ch) - 1);
        }
        return true;
    }
}
