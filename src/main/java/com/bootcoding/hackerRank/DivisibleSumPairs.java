package com.bootcoding.hackerRank;

import java.util.List;

//https://www.hackerrank.com/contests/mountblue-technologies/challenges/divisible-sum-pairs
public class DivisibleSumPairs {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((ar.get(i)+ar.get(j))%k==0 && i!=j){
                    count++;
                }
            }
        }
        return count/2;
    }
}
