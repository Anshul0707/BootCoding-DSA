package com.bootcoding.recursion;

public class PrintArray
{
    public static void main(String[] args)
    {
        int[] arr = {2, 4, 6, 8, 10};
        print(arr, 0);
    }

    public static void print(int[] arr, int index) {
        if (index == arr.length)
        {
            return;
        }
        System.out.println(arr[index]);
        print(arr, index + 1);
    }

}