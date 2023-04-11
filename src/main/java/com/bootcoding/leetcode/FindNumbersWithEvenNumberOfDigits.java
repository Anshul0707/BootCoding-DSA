package com.bootcoding.leetcode;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    private static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int digits = 0;
            while (num != 0) {
                digits++;
                num /= 10;
            }
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}


