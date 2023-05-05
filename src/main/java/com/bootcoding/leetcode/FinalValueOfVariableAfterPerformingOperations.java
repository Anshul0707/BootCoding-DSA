package com.bootcoding.leetcode;

public class FinalValueOfVariableAfterPerformingOperations {
    public static void main(String[] args) {
        String[] operations={"--X","X++","X++"};
        int i = finalValueAfterOperations(operations);
        System.out.println(i);
    }

    private static int finalValueAfterOperations(String[] operations) {
        int res=0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("--X") || operations[i].equals("X--")){
                res=res-1;
            }
            else {
                res=res+1;
            }
        }
        return res;
    }
}
