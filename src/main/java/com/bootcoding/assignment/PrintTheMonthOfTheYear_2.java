package com.bootcoding.assignment;

import java.util.Scanner;

public class PrintTheMonthOfTheYear_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a number between 1 to 12 to get the month name: ");
        int mm = sc.nextInt();

        String [] month={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println(month[mm-1]);
    }

}
