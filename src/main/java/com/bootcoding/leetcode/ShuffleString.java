package com.bootcoding.leetcode;

public class ShuffleString
{
    public static void main(String[] args) {
        String s="codeleet";
        int[] indices={4,5,6,7,0,2,1,3};
        String res = restoreString(s, indices);
        System.out.println(res);

    }

    private static String restoreString(String s, int[] indices) {
        char[] array = new char[indices.length];

        return new String(array);
    }
}
