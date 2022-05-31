package com.objectOriented.basics;
import java.util.Scanner;
public class IO
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("age " + age);
        System.out.println("Enter amount ");
        float amount = sc.nextFloat();
        System.out.println("amount " + amount);

        System.out.println("Enter sample text");
        String newLine = sc.next();
        System.out.println(newLine);

    }
}
