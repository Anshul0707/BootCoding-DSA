package com.bootcoding.leetcode;

import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray
{
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        List<Integer> disappearedNumbers = findDisappearedNumbers(nums);
        System.out.println(disappearedNumbers);
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            while (nums[i]==nums[nums.length]){

            }
        }
        return null;
    }
}
