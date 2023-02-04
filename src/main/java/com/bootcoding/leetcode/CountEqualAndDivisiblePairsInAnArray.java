package com.bootcoding.leetcode;

public class CountEqualAndDivisiblePairsInAnArray
{
    public static void main(String[] args)
    {
        int nums []={3,1,2,2,2,1,3};
        int k = 2;
        int res = countEqualAndDivisiblePairsInAnArray(nums, k);
        System.out.println(res);
    }

    private static int countEqualAndDivisiblePairsInAnArray(int[] nums, int k)
    {
        int count=0;
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i+1; j <nums.length ; j++)
            {
                 if (nums[i]==nums[j])
                 {
                     int sum = i*j;
                     if (sum % k == 0)
                     {
                         count++;
                     }
                 }
            }
        }
        return count;
    }
}
