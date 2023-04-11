package com.bootcoding.leetcode;

import java.util.Arrays;

public class FindGreatestCommonDivisorOfArray
{
    public static void main(String[] args) {
        int[] nums={2,5,6,9,10};
        System.out.println(findGCD(nums));
    }

    private static int findGCD(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        int min=nums[0] , max=nums[nums.length-1];
        for (int i = 1; i <= max; i++) {
            if (min%i==0 && max%i==0) {
                result=i;
            }
        }
        return result;
    }
}
