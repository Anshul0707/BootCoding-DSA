package com.bootcoding.assignment;

import java.util.Scanner;

public class CalculateSalary
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Input the Employees ID: ");
        int ID = s.nextInt();

        System.out.println("Input the working hrs: ");
        int hrs = s.nextInt();

        System.out.println("Salary amount/hr: ");
        int Salary = s.nextInt();

//        Employees ID = 0342
//        Salary = U$ 120000.00

        System.out.println("Employees ID "+ID);
        System.out.println("Salary ="+"U$ "+hrs*Salary);

    }
}
