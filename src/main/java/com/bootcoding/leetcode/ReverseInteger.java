package com.bootcoding.leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        int x=123;
        int reverse = reverse(x);
        System.out.println(reverse);
    }

    private static int reverse(int x) {
        int reverse = 0;
        while(x != 0)
        {
            int remainder = x % 10;
            reverse = reverse * 10 + remainder;
            x = x/10;
        }
        return reverse;
    }
}
