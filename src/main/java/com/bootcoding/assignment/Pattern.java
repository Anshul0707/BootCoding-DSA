package com.bootcoding.assignment;

public class Pattern
{
    public static void main(String[] args)
    {
        int num=5;
        paternOne(num);
    }
    //*
    //**
    //***
    //****
    public static void paternOne(int num)
    {
       String s = "";
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                s=s+"*";
            }
            s =s+"\n";
        }
        System.out.println(s);
    }
}
