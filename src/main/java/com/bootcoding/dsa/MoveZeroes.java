package com.bootcoding.dsa;

import java.util.Arrays;

public class MoveZeroes
{
    public static void main(String[] args)
    {
        MoveZeroes moveZeroes = new MoveZeroes();
        int nums[]={0,0,0,0,2};
        moveZeroes.moveZeroes(nums);
    }
    public void moveZeroes(int[] nums)
    {
        int n = nums.length;
        int indexCount = 0;
        for (int index = 0; index < nums.length; index++)
        {
           if(nums[index] != 0)
           {
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
