package com.collections.collections;
import java.util.HashMap;
import java.util.Stack;
public class StackX
{

    public static void pushAtBottom(int x,Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            s.push(x);
            return;
        }
        int top = s.pop();
        pushAtBottom(x,s);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return;
        }

        int top = s.pop();
        reverse(s);
        pushAtBottom(top,s);
    }

    public static void main(String args[])
    {
        Stack<Integer> s = new Stack<Integer>();
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);

        System.out.println(s.peek());
        System.out.println(s);
        //pushAtBottom(9,s);
        //System.out.println(s);
        reverse(s);
        System.out.println(s);

        try
        {
            int a= 2;
            int b=1;
            System.out.println(a/b);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally");
        }

        HashMap<Character, Integer> map1 = new HashMap<Character,Integer>();
        map1.put('c',3);
        map1.put('c',-1);
        System.out.println(map1);





    }
}
