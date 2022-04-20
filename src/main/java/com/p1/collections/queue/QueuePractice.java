package com.p1.collections.queue;

import java.util.Stack;

public class QueuePractice
{
    static class Queue
    {
        static Stack<Integer> s1 = new Stack<Integer>();
        static Stack<Integer> s2 = new Stack<Integer>();


        public static boolean isEmpty()
        {
            return s1.isEmpty();
        }

        public static void add(int data)
        {
            if(s1.isEmpty())
            {
                s1.add(data);
                return;
            }
            while(!s1.isEmpty())
            {
                int popped_data = s1.pop();
                s2.push(popped_data);
            }
            s1.push(data);

            while(!s2.isEmpty())
            {
                int popped_element = s2.pop();
                s1.push(popped_element);
            }
        }

        public static int remove()
        {
            if(s1.isEmpty())
                return -1;
            int popped_element = s1.pop();
            return popped_element;
        }

        public static int peek()
        {
            if(s1.isEmpty())
                return -1;
            return s1.peek();
        }

    }

    public static void main(String args[])
    {
        Queue q = new Queue();
        q.add(2);
        q.add(5);
        q.add(8);
        q.add(9);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
