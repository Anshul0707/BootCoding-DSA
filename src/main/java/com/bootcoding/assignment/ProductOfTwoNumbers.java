package com.bootcoding.assignment;

import java.util.Scanner;

public class ProductOfTwoNumbers
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Input first number: ");
        int firstnumber = s.nextInt();

        System.out.println("Input second number: ");
        int secondnumber = s.nextInt();

        System.out.println(firstnumber+" x "+secondnumber+" = "+(firstnumber*secondnumber));
    }
}
