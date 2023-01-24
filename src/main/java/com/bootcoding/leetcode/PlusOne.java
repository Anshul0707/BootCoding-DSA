package com.bootcoding.leetcode;
public class PlusOne
{
    public static void main(String[] args) {
        int[] digits={1,2,9};
        plusOne(digits);
    }
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]= digits[i] + 1 ;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] rst = new int[digits.length + 1];
            rst[0] = 1;
            return rst;
        }
        return digits;
    }
}
