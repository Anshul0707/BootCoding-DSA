package com.bootcoding.workshop;

import java.util.Random;

public class OTPGenerator {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(getOTP());
        }
    }
    public static  int getOTP(){
        Random random = new Random();
        int minValue = 10;
        int maxValue = 99;
        return minValue + random.nextInt(maxValue - minValue);

    }
}
