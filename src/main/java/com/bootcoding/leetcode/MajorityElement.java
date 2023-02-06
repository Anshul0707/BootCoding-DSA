package com.bootcoding.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement
{
    public static void main(String[] args)
    {
        int[] nums={2,2,1,1,1,2,2};
        int res = majorityElement(nums);
        System.out.println(res);
    }
    public static int majorityElement(int[] nums)
    {
        Map<Integer, Integer> cache = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
        {
            if(null == cache.get(nums[i]))
            {
                cache.put(nums[i], 1);
            }
            else
            {
                cache.put(nums[i], cache.get(nums[i]) + 1);
            }
        }


        return 0;
    }
}
