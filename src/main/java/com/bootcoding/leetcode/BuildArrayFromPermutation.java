package com.bootcoding.leetcode;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums={0,2,1,5,3,4};
        int[] ints = buildArray(nums);
        for (int res:ints) {
            System.out.println(res);
        }
    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
