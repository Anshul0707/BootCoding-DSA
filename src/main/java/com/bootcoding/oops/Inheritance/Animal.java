package com.bootcoding.oops.Inheritance;

class Animal
{
    void eat()
    {
        System.out.println("eating...");
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("Barking....");
    }
}