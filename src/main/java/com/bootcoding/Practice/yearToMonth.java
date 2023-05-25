package com.bootcoding.Practice;

public class yearToMonth
{
    public static void main(String[] args) {
        double[] years = {1, 2.5, 3.2, 10.5, 15};

        for (double year : years) {
            int months = (int) (year * 12);

            System.out.println(year + " years -> " + months + " months");
        }
    }
}
