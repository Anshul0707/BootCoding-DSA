package com.bootcoding.Practice;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Get the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create the array
        int[] array = new int[size];


        // Populate the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Check even/odd for each element
        for (int i = 0; i < size; i++) {
            if (isEven(array[i])) {
                System.out.println(array[i] + " is even.");
            } else {
                System.out.println(array[i] + " is odd.");
            }
        }
        scanner.close();
    }


    public static boolean isEven(int number)
    {
        return number % 2 == 0;
    }
}

