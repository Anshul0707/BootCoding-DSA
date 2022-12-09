package com.bootcoding.oops;

public class Encapsulation
{
    public static void main(String[] args)
    {
        Person person = new Person();
        person.setName("Arpit");
        System.out.println("Name is: " + person.getName());
    }

    public static class Person
    {
        private String name;

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }
    }

}
