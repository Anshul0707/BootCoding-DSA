package com.bootcoding.leetcode;

public class MultiplyStrings {
    public static void main(String[] args) {
        String num1="2";
        String num2="3";
        String multiply = multiply2(num1, num2);
        System.out.println(multiply);
    }

    private static String multiply(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int multiply = n1 * n2;
        return Integer.toString(multiply);
    }

    private static String multiply2(String num1, String num2) {
        return Integer.toString(Integer.parseInt(num1) * Integer.parseInt(num2));
    }
}
