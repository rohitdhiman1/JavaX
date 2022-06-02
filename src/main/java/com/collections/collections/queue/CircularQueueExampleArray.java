package com.collections.collections.queue;

public class CircularQueueExampleArray
{

    static class Queue
    {
        static int[] arr;
        static int size;
        static int rear =-1;
        static int front = -1;

        Queue(int n)
        {
            size = n;
            arr = new int[n];
        }

        public static void printArray()
        {
            for(int i=0; i < arr.length; i++)
            {
                System.out.println(arr[i]);
            }
        }

        public static boolean isEmpty()
        {
            if(rear == -1 && front == -1)
                return true;
            return false;
        }

        public static boolean isFull()
        {
            if( (rear+1) % size == front )
                return true;
            return false;
        }

        public static void add(int data)
        {
            if(isFull()) {
                System.out.println("queue full");
                return;
            }

            if(front == -1)
                front =0;

            rear = (rear+1) %size;
            arr[rear] = data;
        }

        public static int remove()
        {
            if(isEmpty())
                return -1;

            int result = arr[front];

            if(front == rear )
            {
                front = rear = -1;
            }
            else
            {
                front = (front +1) % size;
            }

            return result;
        }

        public static int peek()
        {
            if(isEmpty())
                return -1;
            return arr[front];
        }

    }


    public static void main(String args[])
    {
        Queue q = new Queue(5);
        q.add(2);
        q.add(4);
        q.add(5);
        q.add(7);
        q.add(9);

        System.out.println(q.isFull());


        System.out.println(q.isEmpty());

        q.remove();
        q.remove();
        q.add(21);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }

        System.out.println("----");
        q.printArray();



    }
}
