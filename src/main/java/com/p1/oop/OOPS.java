package com.p1.oop;

class Pen
{
    String color;
    String type;

    public void write()
    {
        System.out.println("writing something");
    }

    public void printColor()
    {
        System.out.println(this.color);
    }

}

class Student
{
    String name;
    int age;

    Student()
    {
        System.out.println("constructor called");
    }

    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    Student(Student incoming_obj)
    {
        this.name = incoming_obj.name;
        this.age = incoming_obj.age;
    }

    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

class Shape
{
    String color;

    public void area()
        {
            System.out.println("display area");
        }

}

class Triangle extends Shape
{
    public void area(int l, int h)
    {
        System.out.println( 0.5 * l * h);
    }
}

class EquilateralTriangle extends Triangle
{
    public void area(int l, int h)
    {
        System.out.println( 0.5 * l * h);
    }
}

class Circle extends Shape
{
    public void area(int r)
    {
        System.out.println( 3.14 * r * r);
    }

}

abstract class Animal
{
    abstract void walk();

    Animal()
    {
        System.out.println("Inside Animal constructor");
    }
}

class Horse extends Animal
{
    Horse()
    {
        System.out.println("Inside Horse constructor");
    }
    public void walk()
    {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal
{
    public void walk()
    {
        System.out.println("Walk on 2 legs");
    }
}



public class OOPS
{
    public static void main(String args[])
    {
        /*
        Pen p1 = new Pen();
        p1.color = "blue";
        p1.type = "gel";
        p1.write();

        Pen p2 = new Pen();
        p2.color = "black";
        p2.type = "ball";

        p1.printColor();
        p2.printColor();

        Student s1 = new Student("Lily",36);
        Student s2 = new Student(s1);
        //s1.name = "rohit";
        //s1.age = 23;

        System.out.println("=======");
        s1.printInfo();
        s2.printInfo();


        Triangle t1 = new Triangle();
        t1.color = "red";

         */

        Horse h1 = new Horse();
        h1.walk();

    }

}
