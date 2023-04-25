package com.bootcoding.leetcode;

public class SumOfAbsoluteDifferencesInSortedArray
{
    public static void main(String[] args) {
        int[] nums={2,3,5};
        int[] sumAbsoluteDifferences = getSumAbsoluteDifferences(nums);
        for (int result : sumAbsoluteDifferences) {
            System.out.println(result);
        }
    }

    public static int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += Math.abs(nums[i] - nums[j]);
            }
            result[i] = sum;
        }

        return result;
    }
}
