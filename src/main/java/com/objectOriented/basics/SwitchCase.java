package com.objectOriented.basics;

import java.util.HashMap;

public class SwitchCase
{
    public static void main(String args[])
    {
        char grade = 'A';

        switch(grade)
        {
            case 'A' :
                System.out.println("Grade A");
                break;
            case 'B' :
                System.out.println("Grade B");
                break;
            case 'C' :
                System.out.println("Grade C");
                break;
            default :
                System.out.println("wrong argument");
        }
    }
}
