package com.bootcoding.leetcode;

public class BinarySearch
{
    public static void main(String[] args) {
        int [] a={2,3,4,5,6,7};
        int x=6;
        int index = binarySearch(a, x, 0, a.length - 1);
        System.out.println(x + " found in " + index+" index..");
    }
    private  static int binarySearch(int a[],int x,int left,int right) {
        int mid=(left+right)/2;
        if (x==a[mid]) {
            return mid;
        }
        if (left>=right) {
            return -1;
        }
        if (x > a[mid]) {
            return binarySearch(a, x, mid+1, right);
        }
        else {
            return binarySearch(a, x, left, mid-1);
        }
    }
}
