package com.collections.collections.queue;

public class QueueLinkedListExample
{
    public class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }

    }

    static Node head = null;
    static Node tail = null;

    public boolean isEmpty()
    {
        if( head == null && tail == null)
            return true;
        return false;
    }

    public void add(int data)
    {
        Node newNode = new Node(data);
        if(tail == null)
        {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public int peek()
    {
        return head.data;
    }

    public int remove()
    {
        if(isEmpty())
        {
            return -1;
        }
        int return_data = head.data;
        if(head == tail)
        {
            tail = null;
        }
        head = head.next;
        return return_data;
    }

    public static void main(String args[])
    {
        QueueLinkedListExample q = new QueueLinkedListExample();
        q.add(2);
        q.add(3);
        q.add(5);
        q.add(7);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }

    }



}
