package com.bootcoding.assignment;

public class HarmonicSeries
{
    public static void main(String[] args)
    {
        int num=10;
        harmonicSeries(num);
    }

    private static double harmonicSeries(int num)
    {
        double add = 0.0;
        for (double i=1;i<=num;i++)
        {
           add=add+1/i;
        }
        System.out.println(add);
        return add;
    }

}
