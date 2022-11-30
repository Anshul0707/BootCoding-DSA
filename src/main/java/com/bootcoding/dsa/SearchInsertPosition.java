package com.bootcoding.dsa;

public class SearchInsertPosition
{
    public static void main(String[] args)
    {
        int [] nums={1,3,5,6};
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int res=searchInsertPosition.searchInsert(nums,2);
        System.out.println(res);
    }

    public  int searchInsert(int[] nums, int target)
    {
        int length = nums.length;
        for (int i=0;i<length;i++)
        {
            if (target == nums[i] || target<nums[i])
            {
               return i;
            }
        }
        return nums.length;
    }
}
