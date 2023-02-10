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

        int temp=0;

        for(int i=0;i<notes.length;i++) {
            temp=amount/notes[i];
            amount=amount%notes[i];
            System.out.println(temp+" notes of "+notes[i]);
        }
    }

}
