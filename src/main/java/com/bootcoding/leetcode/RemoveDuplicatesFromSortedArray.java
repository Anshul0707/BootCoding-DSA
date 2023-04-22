package com.bootcoding.leetcode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray
{
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        int res = removeDuplicates(nums);
        System.out.println(res);
    }
    private static int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();

        return set.size();
    }
}
