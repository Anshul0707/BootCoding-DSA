package com.bootcoding.leetcode;

import java.util.Arrays;

public class KthLargestElementInAnArray {
    public static void main(String[] args) {
        int[] nums={3,2,3,1,2,4,5,5,6};
        int k=4;
        int kthLargest = findKthLargest(nums, k);
        System.out.println(kthLargest);
    }

    private static int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n-k];
    }
}
