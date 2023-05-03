package com.bootcoding.leetcode;

import java.util.Arrays;

public class AverageSalaryExcludingTheMinimumAndMaximumSalary
{
    public static void main(String[] args) {
        int[] salary={48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        double res = average(salary);
        System.out.println(res);
    }

    private static double average(int[] salary) {
        Arrays.sort(salary);
        int sum=0;
        double count=0;
        for (int i = 1; i < salary.length - 1; i++) {
        sum = sum + salary[i];
        count++;
        }
        return sum/count;
    }
}
