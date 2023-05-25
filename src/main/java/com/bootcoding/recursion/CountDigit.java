package com.bootcoding.recursion;

public class CountDigit
{
    public static void main(String[] args)
    {
        long n = 45678;
        System.out.print("Number of digits"+ countDigit(n));
    }

    private static int countDigit(long n) {
        int count = 0;
        while (n != 0)
        {
            n = n / 10;
            count++;
        }
        return count;
    }
}
