package com.bootcoding.leetcode;


public class RemoveDuplicatesFromSortedArray
{
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        int res = removeDuplicates(nums);
        System.out.println(res);
    }
    private static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0; // pointer to keep track of the non-duplicate element
        for (int j = 1; j < nums.length; j++) { // pointer to traverse the array
            if (nums[j] != nums[i]) {
                i++; // increment i when a new non-duplicate element is found
                nums[i] = nums[j]; // update the non-duplicate element with the value of the new element
            }
        }
        return i + 1; // return the length of the non-duplicate array
    }
}
