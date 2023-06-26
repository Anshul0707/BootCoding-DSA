package com.bootcoding.hackerRank;

import java.util.Collections;
import java.util.List;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        long sum = 0;
        for (long temp : arr) {
            sum += temp;
        }
        System.out.println(sum-arr.get(arr.size()-1) +"  "+ (sum- arr.get(0)));
    }
}
