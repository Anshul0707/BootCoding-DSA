package com.bootcoding.oops.Task;

public class Company
{
    public static void main(String[] args)
    {
        Manager manager = new Manager();
        manager.assignment();
        manager.attendence();
        manager.forwordResume();


        HR hr = new HR();
        hr.resume();
        hr.attendence();
        hr.assignment();
    }
}
