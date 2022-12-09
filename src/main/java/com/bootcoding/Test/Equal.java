package com.bootcoding.Test;

public class Equal
{
    public static void main(String[] args) {
        String str1="Hello";
        String str2="Hellooo";
        boolean res = equal(str1, str2);
        System.out.println(res);
    }

    private static boolean equal(String str1,String str2)
    {
        if (str1.equals(str2))
        {
            return true;
        }
        return false;
    }
}
