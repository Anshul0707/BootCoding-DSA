package com.bootcoding.junit;

import java.util.stream.DoubleStream;

public class Calculator
{
    public static void main(String[] args) {
        double add = add(1, 3);
        System.out.println(add);
    }

    static double add(double... operands)
    {
        return DoubleStream.of(operands).sum();
    }

    static double multiply(double... operands)
    {
        return DoubleStream.of(operands).reduce(1, (a, b) -> a * b);
    }
}
