package com.bootcoding.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement
{
    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};
        int res = majorityElement(nums);
        System.out.println(res);
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> cache = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if(!cache.containsKey(nums[i])) {
                cache.put(nums[i], 1);
            }
            else {
                cache.put(nums[i], cache.get(nums[i]) + 1);
            }
            if (cache.get(nums[i]) > n/2) {
                return nums[i];
            }
        }
        return -1; // If there is no majority element
    }

}
