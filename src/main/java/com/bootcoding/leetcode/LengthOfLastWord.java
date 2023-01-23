package com.bootcoding.leetcode;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s)
    {
        String words[] = s.split(" ");
        return words[words.length-1].length();
    }
}
