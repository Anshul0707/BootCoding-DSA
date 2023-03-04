package com.bootcoding.Test;

public class BothArguments
{
    public static void main(String[] args)
    {
        boolean res = arguments(2, 8);
        System.out.println(res);
    }

    private static boolean arguments(int a, int b) {
        if (a==10 || b==10|| a+b==10)
        {
            return true;
        }
        return false;
    }
}
