package com.bootcoding.leetcode;

import java.util.HashSet;
import java.util.Set;

public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        String sentence="thequickbrownfoxjumpsoverthelazydog";
        boolean b = checkIfPangram(sentence);
        System.out.println(b);
    }

    private static boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        char[] chars = sentence.toCharArray();
        for (char c : chars) {
            set.add(c);
            if (set.size() == 26) {
                return true;
            }
        }

        return false;
    }
}
