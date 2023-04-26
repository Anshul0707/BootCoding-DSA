package com.bootcoding.leetcode;

public class CountTheNumberOfVowelStringsInRange
{
    public static void main(String[] args) {
        String[] words={"hey","aeo","mu","ooo","artro"};
        int left=0;
        int right=2;
        int i = vowelStrings(words, left, right);
        System.out.println(i);
    }

    private static int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for (String oneWord:words) {
            if (oneWord.startsWith("a") ||  oneWord.startsWith("e") || oneWord.startsWith("i") || oneWord.startsWith("o") || oneWord.startsWith("u")){
                if (oneWord.endsWith("a") || oneWord.endsWith("e") || oneWord.endsWith("i") || oneWord.endsWith("o") || oneWord.endsWith("u")){
                    count++;
                }
            }
        }
        return count;
    }
}
