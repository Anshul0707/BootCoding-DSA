package com.bootcoding.hashmap;

public class DuplicateArray
{
    public static void main(String[] args)
    {
         int arr[] = {1, 2, 5, 6, 6, 7, 8, 8, 0};
        duplicateArray(arr);
    }

    private static void duplicateArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
