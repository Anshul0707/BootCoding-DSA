package com.bootcoding.Test;

public class CalFuel
{
    public static void main(String[] args)
    {
        int distance=3;
        int calculateFuel = calculateFuel(distance);
        System.out.println(calculateFuel);
    }

    public static int calculateFuel(int distance) {
        int fuelRequired = distance * 10;
        if (fuelRequired < 100) {
            return 100;
        } else {
            return fuelRequired;
        }
    }
}
