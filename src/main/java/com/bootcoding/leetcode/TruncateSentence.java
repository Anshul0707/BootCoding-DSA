package com.bootcoding.leetcode;

public class TruncateSentence {
    public static void main(String[] args) {
        String s="Hello how are you Contestant";
        int k=4;
        String s1 = truncateSentence(s, k);
        System.out.println(s1);
    }

    public static String truncateSentence(String s, int k) {
        String[] words = s.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(words[i]);
            sb.append(" ");
            if (i != k - 1) {
                sb.append("");
            }
        }
        return sb.toString().trim();
    }

}
