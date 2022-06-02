package com.collections.collections;

public class StackExample
{
    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack
    {
        static public Node head;

        public static boolean isEmpty()
        {
            if(head == null)
                return true;
            return false;
        }

        public static void push(int data)
        {
            Node newNode = new Node(data);
            if(isEmpty())
            {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;

        }

        public static int pop()
        {
            if(head == null)
                return -1;

            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek()
        {
            if(head == null)
                return -1;
            return head.data;
        }

    }

    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(3);
        s.push(7);
        s.push(9);

        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }

    }

}
