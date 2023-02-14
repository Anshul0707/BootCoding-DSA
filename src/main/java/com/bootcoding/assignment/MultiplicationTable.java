package com.bootcoding.assignment;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        int num=8;
        multiplicationTable(num);
    }

    private static void multiplicationTable(int num)
    {
        for (int i=1;i<=10;i++)
        {
            System.out.println(num+" x "+i+" = "+num*i);
        }
    }
}
