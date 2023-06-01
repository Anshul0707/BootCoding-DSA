package com.bootcoding.recursion;

public class NaturalNumber
{
    public static void main(String[] args) {
        int n=1;
        System.out.print("First 50 Natural Numbers are: ");
        printNaturalNumberForWord(n);
        System.out.println("\n");
        System.out.print("Last 50 Natural Numbers are: ");

        printNaturalNumberBackWord(n);
    }

    private static void printNaturalNumberForWord(int n) {
        if(n>50){
            return;
        }
        System.out.print(" "+n+" ");
        printNaturalNumberForWord(n+1);
    }

    private static void printNaturalNumberBackWord(int n) {
        if(n>50){
            return;
        }
        printNaturalNumberBackWord(n+1);
        System.out.print(" "+n+" ");
    }
}
