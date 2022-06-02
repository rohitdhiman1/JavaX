package com.collections.collections;

public class SinglyLinkedListPalindrome
{
    class Node
    {
        String data;
        Node next;

        Node(String data)
        {
            this.data = data;
            this.next = null;
        }

    }

    //head of the linkedlist
    Node head;

    public void insertLast(String data)
    {
        Node input_node = new Node(data);

        if(head == null)
        {
            head = input_node;
            return;
        }

        Node current_node= head;
        while(current_node.next != null)
        {
            current_node = current_node.next;
        }

        current_node.next = input_node;

    }

    public void printList()
    {
        Node itrNode = head;
        while(itrNode != null)
        {
            System.out.print(itrNode.data + " -> ");
            itrNode = itrNode.next;
        }
        System.out.println(" null ");
    }

    public Node reverse(Node incoming_node)
    {
        if(incoming_node == null || incoming_node.next == null)
        {
            return incoming_node;
        }

        Node prev = null;
        Node current = incoming_node;

        while(current != null)
        {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        incoming_node = prev;
        return incoming_node;

    }

    public Node return_middle(Node incoming_node)
    {
        if(incoming_node == null || incoming_node.next == null)
        {
            return incoming_node;
        }

        Node fast= incoming_node;
        Node slow = incoming_node;

        while(fast.next != null && fast.next.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public boolean isPalindrome(Node second_header)
    {
        while(second_header.next != null)
        {
            if(second_header.data != head.data)
            {
                return false;
            }
            second_header = second_header.next;
            head = head.next;
        }

        return true;
    }

    public static void main(String args[])
    {
        SinglyLinkedListPalindrome list1 = new SinglyLinkedListPalindrome();
        list1.insertLast("Sainz");

        System.out.println(list1.head);
        list1.printList();
        Node middleNode = list1.return_middle(list1.head);
        Node second_header = list1.reverse(middleNode.next);
        System.out.println(list1.isPalindrome(second_header));


    }

}
