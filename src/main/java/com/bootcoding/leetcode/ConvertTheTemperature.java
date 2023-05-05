package com.bootcoding.leetcode;

public class ConvertTheTemperature {
    public static void main(String[] args) {
        double celsius=36.50;
        double[] doubles = convertTemperature(celsius);
        for (double res : doubles) {
            System.out.println(res);
        }
    }

    private static double[] convertTemperature(double celsius) {
        double[] res = new double[2];
        res[0]=celsius + 273.15;
        res[1]=celsius  * 1.80 + 32.00;
        return res;
    }
}
