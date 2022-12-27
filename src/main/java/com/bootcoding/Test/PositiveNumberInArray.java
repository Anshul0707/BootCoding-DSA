package com.bootcoding.Test;

public class PositiveNumberInArray
{
    public static void main(String[] args)
    {
        int [] arr={1,5,-3,2,11};
        int res = sumPositive(arr);
        System.out.println(res);
    }
    private static int sumPositive(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num >= 0) {
                sum += num;
            }
        }
        return sum;
    }
}
