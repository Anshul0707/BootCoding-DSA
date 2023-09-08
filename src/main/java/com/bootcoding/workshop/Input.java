package com.bootcoding.workshop;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter username");
        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);

        System.out.println("Enter Age");
        int age = myObj.nextInt();
        System.out.println("age is: " + age);
    }
}
