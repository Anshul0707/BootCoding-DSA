package com.bootcoding.Test;

public class PowerofTwo
{
    public static void main(String[] args)
    {
        int n=16;// enter the value
        PowerofTwo powerofTwo = new PowerofTwo();
        boolean res = powerofTwo.isPowerOfTwo(n);
        System.out.println(res);
    }


    public boolean isPowerOfTwo(int n)
    {
        if (n <= 0)
        {
            return false;
        }
        else if (n == 1)
        {
            return true;
        }
        return n % 2 == 0 && isPowerOfTwo(n / 2);
    }
}

