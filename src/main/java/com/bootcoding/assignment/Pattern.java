package com.bootcoding.assignment;

public class Pattern
{
    public static void main(String[] args)
    {
        int num=5;
        paternOne(num);
        paternTwo(num);
        paternThree(num);
        paternFour(num);
        paternFive(num);
    }
    public static void paternOne(int num)
    {
       String s = "";
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                s=s+"*";
            }
            s =s+"\n";
        }
        System.out.println(s);
    }

    public static void paternTwo(int num)
    {
        String s = "";
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                s=s+j;
            }
            s =s+"\n";
        }
        System.out.println(s);
    }

    public static void paternThree(int num)
    {
        String s = "";
        for(int i = 1; i <= num; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(i+" ");
            }
            System.out.println(s);
        }
    }

    public static void paternFour(int num)
    {
        int i, j, k = 1;
        for (i = 1; i <= num; i++)
        {
            for (j = 1; j< i + 1; j++)
            {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }

    public static void paternFive(int num)
    {
        int i, j, k = 1;
        for (i = 1; i <= num; i++)
        {
            for (j = 1; j< i + 1; j++)
            {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}
