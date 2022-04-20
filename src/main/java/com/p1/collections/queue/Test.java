package com.p1.collections.queue;

import java.util.*;

public class Test
{
    public static void main(String args[])
    {
        int[] arr1 = {1,2,3,4,5};

        LinkedList<Integer> list1 = new LinkedList<Integer>();

        for(int i : arr1)
        {
            list1.add(i);
        }

        System.out.println(list1);

        Queue<Integer> q = list1;
        System.out.println(q.peek());


    }
}
