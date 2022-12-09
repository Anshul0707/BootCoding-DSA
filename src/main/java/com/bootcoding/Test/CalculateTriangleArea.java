package com.bootcoding.Test;

public class CalculateTriangleArea
{
    public static void main(String[] args) {
        double base=15;
        double height=20;
        double output = calculateTriangleArea(base, height);
        System.out.println("Area of Triangle is: "+output);
    }

    private static double calculateTriangleArea(double base ,double height)
    {
        double x =base * height;
        double result=x/2;
        return result;
    }
}
