package com.bootcoding.leetcode;

public class SmallestEvenMultiple {
    public static void main(String[] args) {
        int n = 5;
        int res = smallestEvenMultiple(n);
        System.out.println(res);
    }

    private static int smallestEvenMultiple(int n) {
       int result=0;
        for (int i = 1; i < 10; i++) {
          int sum =n*i;
          if (sum%n==0 && sum%2==0){
              result=sum;
              break;
          }
        }
        return result;
    }
}


