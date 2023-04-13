package com.bootcoding.leetcode;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers
{
    public static void main(String[] args) {
        int [] nums={-1,-2,-3};
        int i = maximumProduct(nums);
        System.out.println(i);
    }

    private static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int product1 = nums[n-1] * nums[n-2] * nums[n-3]; // product of three largest numbers
        int product2 = nums[0] * nums[1] * nums[n-1]; // product of two smallest numbers and largest number

        return Math.max(product1, product2);
    }
}
