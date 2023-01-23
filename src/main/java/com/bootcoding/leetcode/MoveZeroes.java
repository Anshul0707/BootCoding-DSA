package com.bootcoding.leetcode;

public class MoveZeroes
{
    public void moveZeroes(int[] nums)
    { int n = nums.length;
        int indexCount = 0;
        for (int index = 0; index < nums.length; index++)
        {
            if(nums[index] != 0){
                nums[indexCount++] = nums[index];
            }
        }

        while(indexCount < n){
            nums[indexCount++] = 0;
        }
    }
}
