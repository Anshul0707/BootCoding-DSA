package com.bootcoding.leetcode;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num=1;
        boolean res = isPerfectSquare(num);
        System.out.println(res);
    }

    private static boolean isPerfectSquare(int num) {
        if (num < 1) {
            return false;
        }

        long x = num;
        while (x * x > num) {
            x = (x + num / x) / 2;
        }
        return x * x == num;
    }
}
