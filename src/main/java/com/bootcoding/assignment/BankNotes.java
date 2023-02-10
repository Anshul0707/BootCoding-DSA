package com.bootcoding.assignment;

import java.util.Scanner;

public class BankNotes
{
    public static void main(String[] args)
    {
        int amt;
        int rs2000=0, rs500=0, rs100=0, rs50=0, rs20=0, rs10=0, rs5=0, rs2=0 , rs1=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the amount");
        int amount = sc.nextInt();

        while ( amount >= 2000 ) {
            rs2000 = amount / 2000 ;
            amount = amount % 2000;
            System.out.println("\n"+rs2000+" Note(s) of 2000.00");
            break;
        }
        while ( amount >= 500 ) {
            rs500 = amount / 500 ;
            amount = amount % 500;
            System.out.println("\n"+rs500+" Note(s) of 500.00");
            break;
        }while ( amount >= 100 )
        {
            rs100 = amount / 100 ;
            amount = amount % 100;
            System.out.println("\n"+rs100+" Note(s) of 100.00");
            break;
        }
        while ( amount >= 50 ) {
            rs50 = amount / 50 ;
            amount = amount % 50;
            System.out.println("\n"+rs50+" Note(s) of 50.00");
            break;
        }while ( amount >= 20 )
        {
            rs20 = amount / 20 ;
            amount = amount % 20;
            System.out.println("\n"+rs20+" Note(s) of 20.00");
            break;
        }
        while ( amount >= 10 ) {
            rs10 = amount / 10 ;
            amount = amount % 10;
            System.out.println("\n"+rs10+" Note(s) of 10.00");
            break;
        }
        while ( amount >= 5 ) {
            rs5 = amount / 5 ;
            amount = amount % 5;
            System.out.println("\n"+rs5+" Note(s) of 5.00");
            break;
        }
        while ( amount >= 2 ) {
            rs2 = amount / 2 ;
            amount = amount % 2;
            System.out.println("\n"+rs2+" Note(s) of 2.00");
            break;
        }
        while ( amount >= 1 ) {
            rs1 = amount / 1 ;
            amount = amount % 1;
            System.out.println("\n"+rs1+" Note(s) of 1.00");
            break;
        }
    }
    
}
