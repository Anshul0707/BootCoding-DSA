package com.bootcoding.leetcode;

public class CircularSentence
{
    public static void main(String[] args) {
        String sentence="eetcode";
        boolean circularSentence = isCircularSentence(sentence);
        System.out.println(circularSentence);
    }

    private static boolean isCircularSentence(String sentence) {
        int count = 0;
        String[] array = sentence.split(" ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                char lastLetter = array[i].charAt(array[i].length() - 1); // use array[i] instead of sentence
                char firstLetter = array[j].charAt(0);
                if (lastLetter == firstLetter) {
                    count++;
                }
            }
        }
        return count == array.length - 1; // simplify the return statement
    }
}
