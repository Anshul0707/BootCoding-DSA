package com.bootcoding.sorting;

public class InsertionSortExample
{
    public static void main(String[] args)
    {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println("Before Sorting...");
        for (int a : arr)
        {
            System.out.print(a + "  ");
        }
        System.out.println("\nAfter Sorting...");
        selectionSort(arr);
        for (int i : arr)
        {
            System.out.print(i + "  ");
        }
    }

    private static void selectionSort(int[] arr)
    {
        for (int i = 1; i < arr.length; i++)
        {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
