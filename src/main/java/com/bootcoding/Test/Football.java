package com.bootcoding.Test;

public class Football 
{
    public static void main(String[] args) {
       int wins=3;
       int draws=4;
       int losses=2;
        football(wins,draws,losses);
    }

    private static void football(int wins,int draws,int losses)
    {
        int res=wins*3+draws*1+losses*0;
        System.out.println(res);
    }
}
