package com.bootcoding.leetcode;

import java.util.Arrays;

public class FindGreatestCommonDivisorOfArray
{
    public static void main(String[] args) {
        int[] nums={2,1,5,6,9,10};
        findGCD(nums);

    }

    private static int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min=nums[0] , max=nums[nums.length-1];

        return 0;
    }
}
