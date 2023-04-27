package com.bootcoding.leetcode;

public class DifferenceBetweenElementSumAndDigitSumOfAnArray{
    public static void main(String[] args) {
    int [] nums={1,15,16,3};
        int sum = differenceOfSum(nums);
        System.out.println(sum);
    }

    private static int differenceOfSum(int[] nums) {
        int elementSum=0;
        int digitSum=0;
        int digit;
        for (int i = 0; i < nums.length; i++) {
            elementSum=elementSum+nums[i];
            while (nums[i]>0) {
                digit=nums[i]%10;
                digitSum=digitSum+digit;
                nums[i]=nums[i]/10;
            }
        }
        int absoluteDifference=elementSum-digitSum;
        return absoluteDifference;
    }
}
