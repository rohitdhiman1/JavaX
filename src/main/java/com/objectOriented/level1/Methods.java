package com.objectOriented.level1;

public class Methods
{
    //anatomy of a function
    //access-specifier return-type function_name(argument, if any)

    public static void main(String args[])
    {
        System.out.println(average(2,5));
    }

    //sample method
    static int average(int a, int b)
    {
        return (a+b)/2;
    }
}
