package com.bootcoding.recursion;

public class SumOfDigits
{
    public static void main(String[] args)
    {
        int n = 222;
        System.out.print("Sum of digits : "+ sumDigit(n));
    }

    private static int sumDigit(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        return (n % 10 + sumDigit(n / 10));
    }
}
