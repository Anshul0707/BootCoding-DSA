package com.bootcoding.recursion;

public class SumOfNumbers
{
    public static void main(String[] args) {
        int num = 234;
        System.out.println(sumOfNumbers(num));
    }

    private static int sumOfNumbers(int num) {
        if (num <= 1) {
            return num;
        }
        return num + sumOfNumbers(num - 1);
    }
}
