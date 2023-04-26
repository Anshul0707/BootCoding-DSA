package com.bootcoding.leetcode;

public class DivideTwoIntegers
{
    public static void main(String[] args) {
        int dividend=-7;
        int divisor=-3;
        int res = divide(dividend, divisor);
        System.out.println(res);
    }

    private static int divide(int dividend, int divisor) {
        if (dividend<0 && divisor<0) {
            int d1 = Math.abs(dividend);
            int d2 = Math.abs(divisor);
            return d1/d2;
        }
        else {
            return dividend/divisor;
        }
    }
}
