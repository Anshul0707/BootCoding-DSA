package com.bootcoding.dsa;

public class PowerofTwo {
    public static void main(String[] args) {
        PowerofTwo powerofTwo = new PowerofTwo();
        powerofTwo.isPowerOfTwo(16);
    }


    public boolean isPowerOfTwo(int n)
    {
        if (n <= 0)
        {
            return false;
        }
        else if (n == 1)
        {
            return true;
        }
        return n % 2 == 0 && isPowerOfTwo(n / 2);
    }
}

