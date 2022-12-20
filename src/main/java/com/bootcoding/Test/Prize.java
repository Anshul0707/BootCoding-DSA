package com.bootcoding.Test;

public class Prize
{
    public static void main(String[] args)
    {
        double prob = 0.2;
        double prize=50;
        double pay = 9;
        boolean result = cheak(prob, prize, pay);
        System.out.println(result);
    }

    private static boolean cheak(double prob,double prize,double pay)
    {
    if (prob * prize > pay)
    {
    return true;
    }
    return  false;
    }
}
