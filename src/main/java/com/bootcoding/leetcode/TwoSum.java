package com.bootcoding.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum
{
    public int[] twoSum(int[] nums, int target)
    {
        for(int i=0;i<nums.length; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
    public int[] twoSum2(int[] nums, int target)
    {
        Map<Integer, Integer> cache = new HashMap<>();
        int[] aa = new int[2];
        for (int i = 0; i < nums.length; i++)
        {
            if(cache.containsKey(nums[i]))
            {
                aa[0] = cache.get(aa[i]);
                aa[1]=i;
            }
            else
            {
                cache.put(target-aa[i],i);
            }
        }
        return aa;
    }
}
