package com.bootcoding.leetcode;

import java.util.Arrays;

public class MoveZeroes
{
    public static void main(String[] args)
    {
        int nums[]={2,3,0,0,8,0,8,0,9};
        MoveZeroes mm = new MoveZeroes();
        mm.moveZeroes(nums);
    }
    public void moveZeroes(int[] nums)
    { int n = nums.length;
        int indexCount = 0;
        for (int index = 0; index < nums.length; index++)
        {
            if(nums[index] != 0){
                nums[indexCount++] = nums[index];
            }
        }

        while(indexCount < n)
        {
            nums[indexCount++] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
