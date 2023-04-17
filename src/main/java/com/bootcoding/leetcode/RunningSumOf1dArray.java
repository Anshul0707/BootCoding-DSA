package com.bootcoding.leetcode;

public class RunningSumOf1dArray
{
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int[] ints = runningSum(nums);
        for (int i : ints){
            System.out.println(i);
        }
    }

    private static int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = nums[0];
        for (int i = 1; i < nums.length; i++)
            res[i] = res[i-1] + nums[i];
        return res;
    }
}
