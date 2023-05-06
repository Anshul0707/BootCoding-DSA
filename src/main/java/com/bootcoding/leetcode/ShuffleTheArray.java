package com.bootcoding.leetcode;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7};
        int n=3;
        int[] shuffle = shuffle(nums, n);
        for (int res : shuffle) {
            System.out.println(res);
        }
    }

    private static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        int i = 0, j = n, k = 0;
        while (i < n && j < 2*n) {
            result[k++] = nums[i++];
            result[k++] = nums[j++];
        }
        return result;
    }
}
