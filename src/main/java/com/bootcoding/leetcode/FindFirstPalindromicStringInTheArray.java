package com.bootcoding.leetcode;

public class FindFirstPalindromicStringInTheArray {
    public static void main(String[] args) {
        String[] words={"abc","car","ada","racecar","cool"};
        String result = firstPalindrome(words);
        System.out.println(result);
    }

    private static String firstPalindrome(String[] words) {
        for (String originalString : words) {
            StringBuffer sb = new StringBuffer(originalString);
            String revString = sb.reverse().toString();
            if (originalString.equals(revString)) {
                return originalString;
            }
        }
        return "";
    }
}
