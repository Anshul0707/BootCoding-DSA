package com.bootcoding.leetcode;

import java.util.Arrays;

public class AverageSalaryExcludingTheMinimumAndMaximumSalary
{
    public static void main(String[] args) {
        int[] salary={4000,3000,1000,2000};
        double res = average(salary);
        System.out.println(res);
    }

    private static double average(int[] salary) {
        Arrays.sort(salary);
        int sum=0;
        for (int i = 1; i < salary.length - 2; i++) {
        sum = sum + salary[i];
        }
        int hh = (salary.length) - 2;
        return sum/hh;
    }
}
