package com.bootcoding.leetcode;

public class LengthOfLastWord {
    public static void main(String[] args) {

        String s = "Hello World";
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        int res = lengthOfLastWord.lengthOfLastWord(s);
        System.out.println(res);
    }
    public int lengthOfLastWord(String s) {
        String words[] = s.split(" ");
        return words[words.length-1].length();
    }
}
