package com.bootcoding.dsa;

import java.util.Arrays;

public class MultiFunctionArray
{
    public static void main(String[] args)
    {
        int [] arr={23,34,56,12,90,80,40,10};
        String newArr = Arrays.toString(arr);
        System.out.println("Given Array is :"+newArr);
        min(arr);
        max(arr);
        avg(arr);
        reverse(arr);
    }

            private static void min(int [] arr)
            {
                int min = arr[0];
                for(int i=0;i< arr.length;i++)
                {
                   if (arr[i]<min)
                   {
                       min = arr[i];
                   }
                }
                System.out.println("Minimum Value is :"+min);
            }

            private static void max(int [] arr)
            {
                int max = arr[0];
                for(int i=0;i< arr.length;i++)
                {
                    if (arr[i]>max)
                    {
                        max = arr[i];
                    }
                }
                System.out.println("Maximum Value is :"+max);
            }

            private static void avg(int [] arr)
            {
                int sum=0;
                int avg = 0;
                for(int i=0;i< arr.length;i++)
                {
                     sum=sum+arr[i];
                     avg=sum/ arr.length;
                }
                System.out.println("Average Value is :"+avg);
            }

            private static void reverse(int [] arr)
            {
                String s = Arrays.toString(arr);
                System.out.println("Original Array is :"+s);
                int index = arr.length - 1;
                System.out.println("Reverse Array is : ");
                for (int i=index;i>=0;i--)
                {
                    System.out.println(arr[i]);
                }

            }


}
