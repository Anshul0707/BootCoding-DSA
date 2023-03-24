package com.bootcoding.leetcode;

import java.util.Arrays;

public class FindMinimumInRotatedSortedArrayII
{
    public static void main(String[] args) {

    }
//    public static int findMin(int[] nums) {
//        int min = nums[0];
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] < min) {
//                min = nums[i];
//            }
//        }
//        return min;
//    }

    
    public static int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}
