package com.bootcoding.recursion;

public class NaturalNumber
{
    public static void main(String[] args) {
        int n=1;
        System.out.print("First 50 Natural Numbers are:");;
        PrintNaturalNumber(n);
    }

    private static void PrintNaturalNumber(int n)
    {
        if(n<=50)
        {
            System.out.print(" "+n+" ");
            PrintNaturalNumber(n+1);
        }
    }
}
