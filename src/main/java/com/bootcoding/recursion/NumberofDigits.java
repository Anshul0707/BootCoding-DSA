package com.bootcoding.recursion;

public class NumberofDigits
{
    public static void main(String[] args)
    {
        int num=56789;
        System.out.println("Number of Digits:- "+DigitsCount(num));
    }

    static int Count = 0;
    public static int DigitsCount(int Number) {
        if(Number > 0)
        {
            Count = Count + 1;
            DigitsCount(Number / 10);
        }
        return Count;
    }

}
