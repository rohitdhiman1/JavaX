package com.collections.collections;

import java.util.ArrayList;

class Student
{
}


public class ListDemo
{
    public static void main(String args[])
    {

        ArrayList<String> list1 = new ArrayList<String>();

        ArrayList list2 = new ArrayList();

        list1.add("Rsbvd");
        list1.add("vif");
        list1.add("rih");
        list1.add("ei");
        list1.add("ewof");

        list2.add(2);
        list2.add("jbvfe");
        list2.add('q');
        list2.add(true);

        Student s1 = new Student();

        list2.add(s1);

        System.out.println(list1);
        System.out.println(list2);

        Object o1 = list2.get(2);
        System.out.println(o1);


        String[] arr = {"jbuf","wjbfiw"};
        System.out.println(list1);


    }
}
