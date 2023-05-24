package com.bootcoding.leetcode;

public class FindTheIndexOfTheFirstOccurrenceInAString2 {
    public static void main(String[] args) {
        String haystack="sadbutsad";
        String needle="sad";
        int res = strStr(haystack, needle);
        System.out.println(res);
    }

    private static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        return haystack.indexOf(needle);
    }
}
