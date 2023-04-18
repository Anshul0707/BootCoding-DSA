package com.bootcoding.leetcode;

import java.util.Arrays;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums={2,2,3,1};
        int res = thirdMax(nums);
        System.out.println(res);
    }

    private static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length-3];
    }
}
