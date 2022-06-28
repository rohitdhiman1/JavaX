package com.collections.heap;
import java.util.*;

public class PriorityQueueExample
{
    public static void main(String args[])
    {
        //max heap
        Queue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
        q.add(2);
        q.add(20);
        q.add(15);
        q.add(3);

        System.out.println("max_heap front ->" + q.peek());

        Queue<Integer> q2 = new PriorityQueue<Integer>();
        q2.add(15);
        q2.add(20);
        q2.add(10);
        q2.add(18);

        System.out.println("min_heap front -> " + q2.peek());

    }
}
