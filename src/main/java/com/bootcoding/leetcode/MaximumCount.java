package com.bootcoding.leetcode;

public class MaximumCount
{
    public int maximumCount(int[] nums)
    {
        int pCount=0;
        int nCount=0;
        int maximumCount=0;
        for(int i=0;i<nums.length;i++)
        {
            if (nums[i]<0)
            {
                nCount++;
            }
            else if(nums[i]>0)
            {
                pCount++;
            }
        }

        if (pCount>nCount)
        {
            maximumCount=pCount;
        }
        else {
            maximumCount=nCount;
        }
        return maximumCount;
    }
}
