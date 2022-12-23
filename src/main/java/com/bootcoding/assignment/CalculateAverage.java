package com.bootcoding.assignment;

import java.util.Scanner;

public class CalculateAverage
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Input total distance in km");
        int distance = s.nextInt();

        System.out.println("Input total distance in km");
        int fuel = s.nextInt();

        double Average=distance/fuel;
        System.out.println("Average consumption (km/lt) "+Average);

    }
}
