package com.bootcoding.leetcode;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num=1;
        boolean res = isPerfectSquare(num);
        System.out.println(res);
    }

    private static boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        for (int i = 1; i < num; i++) {
            if (i*i==num){
                return true;
            }
        }
        return false;
    }
}
