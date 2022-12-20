package com.bootcoding.hackerRank;

public class SquareRoot
{
    public static void main(String[] args)
    {
    int number=81;
        double res = getSquareRoot(number);
        System.out.println(res);
    }
    public static double getSquareRoot(double number) {
        double temp;
        double sqrt = number / 2;
        do
        {
            temp = sqrt;
            sqrt = (temp + (number / temp)) / 2;
        }
        while ((temp - sqrt) != 0);
        return sqrt;
    }
}
