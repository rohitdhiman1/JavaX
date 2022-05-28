package com.collections.queue;

public class QueueArrayExample
{
    public static class Queue
    {
        static int[] arr;
        static int size;
        static int rear = -1;

        Queue(int n)
        {
            arr = new int[n];
            size = n;
        }

        public static boolean isEmpty()
        {
            return rear == -1;
        }

        //add function (enqueue)
        public static void add(int data)
        {
            if(rear == size -1)
                return;
            rear++;
            arr[rear] = data;
        }

        //remove (dequeue)
        public static int remove()
        {
            if(isEmpty())
                return -1;
            int front = arr[0];
            for(int i=0; i < rear ; i++)
            {
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        public static int peek()
        {
            if(isEmpty())
                return -1;
            return arr[0];
        }


    }

    public static void main(String args[])
    {
        Queue q = new Queue(5);
        q.isEmpty();
        q.add(2);
        q.add(4);
        q.add(5);
        q.add(7);
        q.add(9);

        //System.out.println(q.peek());

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }

        System.out.println(q.peek());

    }

}
