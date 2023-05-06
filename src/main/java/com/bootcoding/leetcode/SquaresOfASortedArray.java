package com.bootcoding.leetcode;
import java.util.Arrays;

public class SquaresOfASortedArray
{
    public static void main(String[] args) {
        int[] nums={-4,-1,0,3,10};
        int[] ints = sortedSquares(nums);
        for (int res : ints) {
            System.out.println(res);
        }
    }

    private static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
