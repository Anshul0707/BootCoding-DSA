package com.bootcoding.oops.Task;


class Manager extends Employee
{
    void forwordResume()
    {
        System.out.println(" This method is use to forword resume....");
    }

    @Override
    void assignment()
    {
        System.out.println("assignment in manager class..");
    }
}
