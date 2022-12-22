package com.bootcoding.assignment;

public class DividedByASpecifiedNumber
{
    public static void main(String[] args)
    {
        int num=25;
        getRemainde(num);
    }

    private static void getRemainde(int num)
    {
        for (int i=1;i<=100;i++)
        {
           if (i%num==3)
           {
               System.out.println(i);
           }
        }
    }

}
