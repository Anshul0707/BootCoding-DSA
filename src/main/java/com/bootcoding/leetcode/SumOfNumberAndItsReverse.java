package com.bootcoding.leetcode;

public class SumOfNumberAndItsReverse {
    public static void main(String[] args) {
        int num=181;
        boolean b = sumOfNumberAndReverse(num);
        System.out.println(b);
    }

    private static boolean sumOfNumberAndReverse(int num) {
        int original = 0;
        int reverse = 0;
        for (int i = num/2; i < num; i++) {
            original=i;
            reverse = 0;
            while(original != 0) {
                int remainder = original % 10;
                reverse = reverse * 10 + remainder;
                original = original/10;
            }
            if (original+reverse==num){
                return true;
            }
        }
        return false ;
    }

}
