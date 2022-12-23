package com.bootcoding.assignment;

import java.util.Scanner;

public class CalculatesNumbersOfNotes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the amount: ");
        int amount = sc.nextInt();

        int [] notes={2000,500,200,100,50,20,10,5,2,1};

        int temp=amount;
        int totalNotes=0;
        int count=0;

        for(int i=0;i<9;i++)
        {
            temp=amount/notes[i];
            if(count!=0)
            {
                System.out.println(notes[i]+notes[i]*temp);
            }
            totalNotes=totalNotes+temp;
            amount=amount%notes[i];
        }
    }

}
