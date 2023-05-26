package com.bootcoding.recursion;

public class PrintEvenOrOdd
{
    public static void main(String[] args) {
        int first=1;
        int last=10;


        System.out.println("Odd Num");
        printOdd(first,last);
        System.out.println("Even Num");
        printEven(first,last);

    }

    private static void printEven(int first, int last) {
        if (first>last) {
            return;
        } else if (first % 2 ==0) {
            System.out.println(first+" ");
        }
        printEven(first+1,last);
    }
    private static void printOdd(int first, int last)
    {
        if (first>last) {
            return;
        } else if (first % 2 ==1) {
            System.out.println(first+" ");
        }
        printOdd(first+1,last);
    }
}
