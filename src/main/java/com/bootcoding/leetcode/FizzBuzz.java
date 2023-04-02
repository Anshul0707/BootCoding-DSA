package com.bootcoding.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz
{
    
    public List<String> fizzBuzz(int n) {
        ArrayList<String> str=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                str.add("FizzBuzz");
            }
            else if(i%5==0)
            {
                str.add("Buzz");
            }
            else if(i%3==0)
            {
                str.add("Fizz");
            }
            else
            {
                str.add(String.valueOf(i));
            }
        }
        return str;
    }
}
