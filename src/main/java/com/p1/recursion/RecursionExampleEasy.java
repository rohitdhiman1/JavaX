package com.p1.recursion;

public class RecursionExampleEasy
{
    // Recursion needs an exit strategy (base condition) so that the recursive calls don't go into infinite recursion

    public static void sayHello(int count)
    {
        //base case
        if(count <= 0)
        {
            System.out.println("Hello");
            return;
        }

        sayHello(count -1);
    }


    //reverse a string using recursion
    public static String reverse(String s)
    {
        if(s.equals(""))
        {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String args[])
    {
        //sayHello(3);

        String s = "hello";
        System.out.println(reverse("hello"));

        char[] abc = "hello".toCharArray();
    }
}
