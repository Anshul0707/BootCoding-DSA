package com.bootcoding.leetcode;
import java.util.HashMap;
import java.util.Map;

public class SumOfUnique
{
    public static void main(String[] args)
    {
        int [] nums={10,6,9,6,9,6,8,7};
        int res = sumOfUnique(nums);
        System.out.println(res);
    }

    public static int sumOfUnique(int[] nums)
    {
        int temp=0;
        int sum=0;
        Map<Integer, Integer> cache = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            if(null == cache.get(nums[i])){
                cache.put(nums[i], 1);
            }else{
                cache.put(nums[i], cache.get(nums[i]) + 1);
            }
        }
        for(int key: cache.keySet()){
            if(cache.get(key) == 1) {
                sum = sum + key;
            }
        }
        return sum;
    }
}
