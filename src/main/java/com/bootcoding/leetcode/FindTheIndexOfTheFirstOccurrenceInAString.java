package com.bootcoding.leetcode;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        String haystack="sadbutsad";
        String needle="sad";
    }

    private static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }


        return haystack.indexOf(needle);
    }
}
