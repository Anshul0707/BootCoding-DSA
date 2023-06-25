package com.bootcoding.hackerRank;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        if (checkPalindrome(A)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    public static boolean checkPalindrome(String A) {
        String nstr = "";
        char ch;
        for (int i = 0; i < A.length(); i++) {
            ch = A.charAt(i); //extracts each character
            nstr = ch + nstr; //adds each character in front of the existing string
        }
        return A.equals(nstr);
    }
}
