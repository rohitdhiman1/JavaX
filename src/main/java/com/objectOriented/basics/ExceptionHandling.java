package com.objectOriented.basics;

public class ExceptionHandling
{
    public static void main(String args[])
    {
        //try - catch - raise

        //
        try
        {
            int z = 7/0;
        }
        catch(Exception e)
        {
            System.out.println("Error occurred");
            System.out.println(e.getMessage());
        }

    }
}
