package com.collections.collections;
import java.util.Stack;

public class StackPractice1
{
    public static void pushAtBottom(int data, Stack<Integer> s)
    {
        if(s.isEmpty() ) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty())
            return;
        int current = s.pop();
        reverse(s);
        pushAtBottom(current,s);
    }

    public static void main(String args[])
    {
        Stack<Integer> s = new Stack<Integer>();
        s.push(3);
        s.push(6);
        s.push(9);

        //System.out.println(s.peek().getClass());

        pushAtBottom(17,s);

        reverse(s);
        while(s.isEmpty() != true)
        {
            System.out.println(s.peek());
            s.pop();
        }

        //System.out.println(s.pop());
        //System.out.println(s.peek());



    }
}
