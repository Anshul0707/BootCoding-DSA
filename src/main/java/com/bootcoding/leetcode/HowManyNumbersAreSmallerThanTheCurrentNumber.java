package com.bootcoding.leetcode;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int [] nums={8,1,2,2,3};
        int[] res = smallerNumbersThanCurrent(nums);
        for (int rrr:res) {
            System.out.println(rrr);
        }
    }

    private static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] > nums[j]) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }

}
