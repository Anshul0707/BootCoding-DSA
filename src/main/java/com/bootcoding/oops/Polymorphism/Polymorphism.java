package com.bootcoding.oops.Polymorphism;

public class Polymorphism
{
    public static void main(String[] args)
    {
        Sum s = new Sum();
        System.out.println(s.sum(10,20));
        System.out.println(s.sum(10,20,30));
        System.out.println(s.sum(2.5,4.5));
    }
}
