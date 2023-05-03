package com.bootcoding.leetcode;

public class FindTheDivisibilityArrayOfAString
{
    public static void main(String[] args) {
        String word="998244353";
        int m=3;
        int[] divisibilityArray = divisibilityArray(word, m);
        for (int res : divisibilityArray) {
            System.out.println(res);
        }
    }

    private static int[] divisibilityArray(String word, int m) {
        int n = word.length();
        int[] div = new int[n];
        int num = 0;
        System.out.println("gggggggggggggg== "+word.charAt(0));
        for (int i = 0; i < n; i++) {
            num = (num * 10 + (word.charAt(i) - '0')) % m;
            if (num == 0) {
                div[i] = 1;
            }
        }
        return div;
    }
}
