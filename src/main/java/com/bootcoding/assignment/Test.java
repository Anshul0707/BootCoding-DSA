package com.bootcoding.assignment;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1St num");
        int a=sc.nextInt();

        System.out.println("Enter 2nd num");
        int b=sc.nextInt();
        multiplicationVariable(a,b);
    }
    public static void multiplicationVariable(int a,int b){

        int res = 0;
        res = a*b;

        System.out.println(res);
    }
}
