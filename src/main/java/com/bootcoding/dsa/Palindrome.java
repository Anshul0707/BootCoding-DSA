package com.bootcoding.dsa;

public class Palindrome
{
    public static void main(String[] args)
    {
     int x=121;
     isPalindrome(x);
    }
    public static void isPalindrome(int x)
    {
        if(x < 0)
        {
            System.out.println("Number Should be greater than zero and not be negative..");
        }

        int original = x;
        int reversed = 0;
        while(x > 0){
            reversed = reversed*10 + x%10;
            x /= 10;
        }

         if (original == reversed)
         {
             System.out.println(original+"  is Palindrome Number");
         }
    }
}
