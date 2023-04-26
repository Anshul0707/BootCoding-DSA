package com.bootcoding.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArray
{
    public static void main(String[] args) {
    int[] nums={1,2,5,2,3};
    int target=2;
        List<Integer> integers = targetIndices(nums, target);
        System.out.println(integers);
    }

    private static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums); // Sort the input array in ascending order

        List<Integer> index  = new ArrayList<>(); // Create an empty list to store the target index

        // Iterate loop,check target is equal to indices or not, then add  those element in list.
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                index.add(i);
            }
        }
        return index;
    }
}
