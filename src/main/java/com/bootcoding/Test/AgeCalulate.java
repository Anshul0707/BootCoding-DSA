package com.bootcoding.Test;

public class AgeCalulate
{
    public static void main(String[] args) {
        int age=34;
        int result = ageCulculate(age);
        System.out.println(result);
    }
    private static int ageCulculate(int age)
    {
        int days = 0;
        if (age>=0) {
            days=age*365;
        }
        else {
            System.out.println("Age should be +ve");
        }
        return days;
    }
}
