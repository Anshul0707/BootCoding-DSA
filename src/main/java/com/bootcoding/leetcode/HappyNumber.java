package com.bootcoding.leetcode;

public class HappyNumber {
    public static void main(String[] args) {
        int n=19;
        boolean result = isHappy(n);
        System.out.println(result);
    }

    private static boolean isHappy(int n) {
        int sum=1;
        while (n==1) {
            sum=n;
            int digit=n%10;
            sum = sum + digit * digit;
            n= n / 10;
        }
        return false;
    }
}
