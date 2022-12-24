package com.bootcoding.assignment;

import java.util.Scanner;

public class ConvertToSeconds
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Input seconds: ");
        int seconds = s.nextInt();

        int sec=seconds % 60;
        int hrs=seconds / 60;
        int min=hrs % 60;
        hrs=hrs/60;
        System.out.println(hrs+":"+min+":"+sec);
    }
}
