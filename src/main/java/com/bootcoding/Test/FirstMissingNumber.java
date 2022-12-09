package com.bootcoding.Test;

public class FirstMissingNumber
{
    public static void main(String[] args)
    {
        int [] nums={1,2,3,5,6,7};
        int res = missingNumber(nums);
        System.out.println(res);
    }

    public static int missingNumber(int[] nums)
    {
        int missingNumber = 0;
        int numsLength = nums.length;
        for (int i = 0; i < numsLength-1; i++)
        {
            if (nums[i+1] - nums[i] != 1)
            {
                missingNumber = nums[i] + 1;
            }

        }
        return missingNumber;
    }
}
