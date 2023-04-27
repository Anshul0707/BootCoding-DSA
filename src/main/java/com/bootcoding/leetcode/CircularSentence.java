package com.bootcoding.leetcode;

public class CircularSentence
{
    public static void main(String[] args) {
        String sentence="eetcode";
        boolean circularSentence = isCircularSentence(sentence);
        System.out.println(circularSentence);
    }

    public static boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");

        if (words.length==1 && sentence.charAt(0) == sentence.charAt(sentence.length()-1)){
            return true;
        }

        if (words.length==1 && sentence.charAt(0)!=sentence.charAt(sentence.length()-1)){
            return false;
        }

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (!Character.isLetter(ch) && sentence.charAt(i-1)!=sentence.charAt(i+1) || sentence.charAt(0)!=sentence.charAt(sentence.length()-1)){
               return false;
            }
        }

        return true;
    }

}
