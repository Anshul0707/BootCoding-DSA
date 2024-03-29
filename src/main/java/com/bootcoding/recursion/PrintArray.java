package com.bootcoding.recursion;

public class PrintArray
{
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10,8};
        printForward(arr, 0);
        printReverse(arr,0);
    }

    public static void printForward(int[] arr, int index) {
        if (index == arr.length)
        {
            return;
        }
        System.out.println(arr[index]);
        printForward(arr, index + 1);
    }

    public static void printReverse(int[] arr, int index) {
        if (index == arr.length)
        {
            return;
        }
        printReverse(arr, index + 1);
        System.out.println(arr[index]);
    }

}