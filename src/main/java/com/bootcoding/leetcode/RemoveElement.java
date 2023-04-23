package com.bootcoding.leetcode;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums={3,2,2,3};
        int val=3;
        removeElement(nums,val);
    }

    private static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
