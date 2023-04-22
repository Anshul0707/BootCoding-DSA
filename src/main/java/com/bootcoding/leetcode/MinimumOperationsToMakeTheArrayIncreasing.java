package com.bootcoding.leetcode;

public class MinimumOperationsToMakeTheArrayIncreasing
{
    public static void main(String[] args) {
        int[] nums={1,1,1};
        int res = minOperations(nums);
        System.out.println(res);
    }

    private static int minOperations(int[] nums) {
        int count=0;
        for (int i = 1; i <nums.length; i++) {
            if (nums[i]<= nums[i-1]){
              int diff=nums[i-1]-nums[i]+1;
              nums[i]=nums[i]+diff;
              count=count+diff;
            }
        }
        return count;
    }
}
