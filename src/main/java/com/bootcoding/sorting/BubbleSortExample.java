package com.bootcoding.sorting;

public class BubbleSortExample {
    public static void main(String[] args)
    {
        int[] arr = {5,1,7,4};
        bubbleSortExample(arr);
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
    }

    private static void bubbleSortExample(int[] arr)
    {
        int temp = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 1; j < arr.length; j++)
            {
                if (arr[j - 1] > arr[j])
                {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
