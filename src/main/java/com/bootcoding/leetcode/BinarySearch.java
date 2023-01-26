package com.bootcoding.leetcode;

public class BinarySearch
{
    public int search(int[] nums, int target)
    {
        return binarySearch(nums,target,0,nums.length-1);
    }
    private int binarySearch(int a[],int x,int left,int right)
    {
        int mid=(left+right)/2;
        if (x==a[mid])
        {
            return mid;
        }
        if (left>=right)
        {
            return -1;
        }
        if (x > a[mid])
        {
            return binarySearch(a, x, mid+1, right);
        }
        else
        {
            return binarySearch(a, x, left, mid-1);
        }
    }
}
