package com.bootcoding.recursion;

public class ReverseString {
    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 8};
        reverseString(arr, 0);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    private static void reverseString(int arr[], int i) {
        int n = arr.length;
        if (i > n / 2) {
            return;
        }
        int t = arr[1];
        arr[i] = arr[n - 1 - i];
        arr[n - 1 - i] = t;

        reverseString(arr, i + 1);
    }

}
