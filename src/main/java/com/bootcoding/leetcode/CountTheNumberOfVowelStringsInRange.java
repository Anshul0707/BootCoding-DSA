package com.bootcoding.leetcode;

public class CountTheNumberOfVowelStringsInRange
{
    public static void main(String[] args) {
        String[] words={"ce","ai"};
        int left=1;
        int right=1;
        System.out.println(vowelStrings(words, left, right));
    }

    public static int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            String word = words[i];
            char first = word.charAt(0);
            char last = word.charAt(word.length() - 1);
            if (isVowel(first) && isVowel(last)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
