package com.bootcoding.assignment;

public class CorrectOrNot
{
    public static void main(String[] args)
    {
        int p=3;
        int q=35;
        int r=15;
        int s=46;
        correctOrNot(p, q, r, s);
    }

    private static void correctOrNot(int p,int q,int r,int s)
    {
        int SR=s+r;
        int PQ=p+q;

        if (p%2==0 && q>0 && r>0 && s>0)
        {
            if (q>r && s>p && SR>PQ)
            {
                System.out.println("Correct values");
            }
            else
            {
                System.out.println("Wrong values");
            }
        }
        else
        {
            System.out.println("p is Not even");
        }
    }

}
