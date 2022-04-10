package com.p1.control;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class ControlStatements
{

    //main is the starting point for JVM to start execution.
    //public - should be visible to JVM
    //static - so that we don't need to create object of main method
    //void - no return type. It doen not makes sense to return something for the main method.
    //String args[] - program will compile without it, but will fail to run - why? -> JVM always looks for main method with STring type as a parameter
    public static void main(String args[])
    {

        // Type casting
        // Any datatype to String -> String.valueOf(x)     
        // String to Int -> Integer.toString(a)
        // String to Long -> Long.parseLong(a)
        // String to Boolean -> Boolean.parseBoolean(a)
        // A char can be assigned to int, long, double and float. Equivalent ascii value is stored in respective data types


        int a = 10;
        int b = 20;
        float c = 2.6f;
        double e = 3.44;
        char d = 'A';
        Boolean f = true;
        String g = "";
        long i = 10;
        short j = 20;
        byte k = 127;
        String x = "40";
        //System.out.println(Integer.toString(a) + b + c + d + e + f + g + i + j + k + x);
        //System.out.println(a + b);

        //System.out.println( Long.parseLong(x)  );

        int z = d;
        
        System.out.println(z);

        switch (a +b)
        {
            case 10:
                System.out.println("Value 10");
            case 20:
                System.out.println("Value 20");
            case 30:
                System.out.println("value 30");
            default:
                System.out.println("Value default");
        }





    }

}
