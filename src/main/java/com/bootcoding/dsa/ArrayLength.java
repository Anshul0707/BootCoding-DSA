package com.bootcoding.dsa;

public class ArrayLength
{
    public static void main(String[] args)
    {
        int arr1[]={1,4,6,7};
        int arr2[]={1,4,6,8};
        boolean result = arryEql(arr1,arr2);
        System.out.println(result);
    }

    private static boolean arryEql(int[] arr1,int [] arr2)
    {

        if (arr1.length == arr2.length)
        {
            for (int i = 0; i < arr1.length; i++)
            {
                if (arr1[i] != arr2[i])
                {
                    return  false;
                }
            }
        }
        return true;
    }
}
