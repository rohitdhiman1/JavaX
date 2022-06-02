package com.collections.collections;

public class StackClass
{
    static class Node
    {
        String data;
        Node next;

        Node(String data)
        {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    static class Stack
    {
        public boolean isEmpty()
        {
            if(head == null)
            {
                return true;
            }

            return false;
        }

        public void push(String data)
        {
            Node new_node = new Node(data);
            if(head == null)
            {
                head = new_node;
                return;
            }

            new_node.next = head;
            head = new_node;
        }

        public String pop()
        {
            if(isEmpty())
            {
                return "Nothing to pop";
            }

            String top = head.data;
            head = head.next;
            return top;
        }

        public String peek()
        {
            if(isEmpty())
            {
                return "Nothing to peek";
            }
            return head.data;
        }

        public void pushAtBottom(String data, Stack s)
        {
            if(isEmpty())
            {
                s.push(data);
                return;
            }

            String top = s.pop();
            pushAtBottom(data, s);
            s.push(top);
        }

        public void removeAtBottom(Stack s)
        {
            if(isEmpty())
            {
                return;
            }

            if(head.next == null)
            {
                s.pop();
                return;
            }

            String top = s.pop();
            removeAtBottom(s);
            s.push(top);

        }

        public void printStack()
        {
            Node currentNode = head;
            while(currentNode != null)
            {
                System.out.print(currentNode.data + " -> ");
                currentNode = currentNode.next;
            }
            System.out.println( " NULL");
        }


    }

    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push("Red");
        s.push("Blue");
        s.push("Black");
        s.push("Green");

        s.pop();
        s.printStack();
        System.out.println(s.peek());

        s.pushAtBottom("Yellow",s);
        s.printStack();
        s.removeAtBottom(s);
        s.printStack();

    }
}
