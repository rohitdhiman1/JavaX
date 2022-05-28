package com.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueCollectionExample
{
    public static void main(String args[])
    {
        //Queue<Integer> q = new LinkedList<Integer>();
        Queue<Integer> q = new ArrayDeque<Integer>();

        q.add(2);
        q.add(3);
        q.add(5);
        q.add(9);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
