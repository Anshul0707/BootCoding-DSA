package com.bootcoding.assignment;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        int n=8;
        multiplicationTable(n);
    }

    private static void multiplicationTable(int n)
    {
        for (int i=1;i<=10;i++)
        {
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}
