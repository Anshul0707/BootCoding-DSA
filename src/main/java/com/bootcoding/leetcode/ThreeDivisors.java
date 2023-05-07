package com.bootcoding.leetcode;

public class ThreeDivisors
{
    public static void main(String[] args) {
        int n=14;
        boolean res = isThree(n);
        System.out.println(res);
    }

    private static boolean isThree(int n) {
        int count=0;
        int i;
        for (i = 1; i <=n; i++) {
            if (n%i==0){
                count++;
            }
        }
        return count==3;
    }
}
