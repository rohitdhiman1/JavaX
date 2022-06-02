package com.collections.collections;

import java.util.*;

public class SinglyLinkedList
{
    // Define head
    Node head;

    // Define Node class with 2 attributes - data and next
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

    //Insert at the start
    void insertStarting(String data)
    {
        Node currentNode = new Node(data);

        if(head == null)
        {
            head = currentNode;
            return;
        }

        currentNode.next = head;
        head = currentNode;
    }


    //Insert at the end
    void insertAtEnd(String data)
    {
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
            return;
        }

        Node currentNode = head;
        while(currentNode.next !=null)
        {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;

    }

    //Print linked list
    void printList()
    {
        Node iteratorPointer = head;
        while(iteratorPointer != null)
        {
            System.out.print(iteratorPointer.data + " -> ");
            iteratorPointer = iteratorPointer.next;
        }

        System.out.println(" NULL");

    }

    //method to print size
    void printSize()
    {
        Node currentNode = head;
        int counter =0;
        while(currentNode != null)
        {
            currentNode = currentNode.next;
            counter++;
        }
        System.out.println("Size of linked list is = " + counter);
    }

    //method to delete first node
    void deleteFirst()
    {
        if(head != null)
        {
            head = head.next;
        }
    }

    //method to delete last node
    void deleteLast()
    {
        if(head != null)
        {

            if(head.next == null)
            {
                head =null;
                return;
            }

            Node currentNode = head.next;
            Node secondLastNode = head;

            while(currentNode.next != null)
            {
                currentNode = currentNode.next;
                secondLastNode = secondLastNode.next;
            }

            secondLastNode.next = null;
        }
    }

    //method to reverse linked list
    public void reverse()
    {
        if(head == null || head.next == null)
        {
            return ;
        }

        Node prevNode = head;
        Node currentNode = head.next;

        while(currentNode != null)
        {
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;

            //update
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    //recursion method to reverse link list
    public Node reverseRecursion(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        Node newHead = reverseRecursion(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;

    }

    //delete nth element
    public void deleteWithIndex(int index)
    {
        int counter =0;

        if(index ==0)
        {
            if(head.next ==null)
            {
                head = null;
            }

            else
            {
                head = head.next;
            }
        }

        else
        {
            Node temp = head;
            while( counter != index-1)
            {
                temp = temp.next;
                counter++;
            }

            temp.next = temp.next.next;
        }


    }


    public static void main(String ags[])
    {
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.insertStarting("Gasly");
        list1.insertStarting("Ocon");
        list1.insertStarting("Bottas");
        list1.insertStarting("Sainz");
        list1.printList();
        list1.insertAtEnd("Mazespin");
        list1.insertStarting("Charles");
        list1.printList();
        list1.printSize();
        list1.deleteFirst();
        list1.printList();
        list1.deleteLast();
        list1.printList();
        list1.reverse();
        list1.printList();
        list1.head =  list1.reverseRecursion(list1.head);
        list1.printList();
        list1.deleteWithIndex(3);
        list1.printList();

        int[] a = {78,56,25,11,90};
        int[] b = Arrays.copyOfRange(a,1,5);
        for(int i : b)
        {
            System.out.println(i);
        }

    }

}
