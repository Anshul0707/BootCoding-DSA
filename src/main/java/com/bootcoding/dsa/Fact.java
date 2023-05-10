package com.bootcoding.dsa;

public class Fact
{
    public static void main(String[] args) {
        long res=getFact(5);
        System.out.println(res);
    }

    private static long getFact(int n) {
        if (n==1)
        {
            return 1;
        }
        return n * getFact(n-1);
    }
}
