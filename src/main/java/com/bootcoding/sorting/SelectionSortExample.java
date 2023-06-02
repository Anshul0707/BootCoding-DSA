package com.bootcoding.sorting;

public class SelectionSortExample
{
    public static void main(String[] args)
    {
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Before Sorting...");
        for (int a : arr) {
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
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j] < arr[index])
                {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
}
