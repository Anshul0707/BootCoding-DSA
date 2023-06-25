package com.bootcoding.hackerRank;

import java.util.List;

public class AVeryBigSum {
    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long sum = 0;
        for (long temp : ar) {
            sum += temp;
        }
        return sum;
    }
}
