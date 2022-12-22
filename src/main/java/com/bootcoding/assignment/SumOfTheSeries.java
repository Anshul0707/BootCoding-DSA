package com.bootcoding.assignment;

public class SumOfTheSeries
{
    public static void main(String[] args)
    {
        int n=5;
        sumOfTheSeries(n);
    }

    private static int sumOfTheSeries(int n)
    {
    int sum=0;
    int num=1;
        for (int i=0;i<n;i++)
        {
            sum=sum+num;
            num=num*10+1;
        }
        System.out.println(sum);
        return sum;
    }

}
