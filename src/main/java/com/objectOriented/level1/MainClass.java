package com.objectOriented.level1;

import com.objectOriented.encapsulation.EncapsulationIntro;

import java.util.*;
public class MainClass
{
    public static void main(String args[])
    {
        Person p1 = new Person();
        p1.name = "Alex";
        p1.age = 22;

        p1.walk(2300);

        System.out.println("count of objects = " + Person.count);

        Person p2 = new Person(23,"Morgan");
        p2.walk(2345);
        System.out.println("count of objects = " + Person.count);

        Developer d1 = new Developer(28, "Gareth");
        d1.walk();



    }

}

class Person
{
    int age;
    String name;
    static int count;

    Person()
    {
        System.out.println("creating an object");
        count++;
    }

    Person(int age, String name)
    {
        this();
        this.age = age;
        this.name = name;
    }

    void walk()
    {
        System.out.println(name + " is walking");
    }

    void eat()
    {
        System.out.println(name + " is eating");
    }

    void walk(int steps)
    {
        System.out.println(name + " has walked " + steps + " steps");
    }

    void doWork()
    {
        System.out.println(this.name + " doing work");
    }

}


class Developer extends Person
{
    Developer(int age, String name)
    {
        super(age, name);
    }

    void walk()
    {
        System.out.println("Developer " + this.name + " is walking.");
    }


}
