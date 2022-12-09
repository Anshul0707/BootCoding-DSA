package com.bootcoding.Test;

public class Converts
{
    public static void main(String[] args) {
        int minutes=5;
        int results = converts(minutes);
        System.out.println(results);
    }

    private static int converts(int minutes)
    {
        int seconds=minutes*60;

        return seconds;
    }
}
