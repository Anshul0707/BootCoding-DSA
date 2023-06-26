package com.bootcoding.hackerRank;

import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        double positive=0;
        double negative=0;
        double zero=0;


        for (double res : arr) {
            if (res>0) {
                positive++;
            } else if (res<0) {
                negative++;
            } else if (res==0) {
                zero++;
            }
        }

        System.out.println(positive/arr.size());
        System.out.println(negative/arr.size());
        System.out.println(zero/arr.size());
    }

}
