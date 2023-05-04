package com.bootcoding.leetcode;

import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums={4,1,2,1,2};
        int result = singleNumber(nums);
        System.out.println(result);
    }

    private static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i)+1);
            }
            else {
                map.put(i, 1);
            }
        }
        for (int num : nums) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
}
