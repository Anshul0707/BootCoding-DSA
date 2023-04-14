package com.bootcoding.leetcode;

public class ConcatenationOfArray
{
    public static void main(String[] args) {
        int [] nums={1,2,1};
        int[] concatenation = getConcatenation(nums);
        for (int res:concatenation) {
            System.out.print(res);
        }
    }

    private static int[] getConcatenation(int[] nums) {
        int[] ans = new int[(nums.length)*2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }
}
