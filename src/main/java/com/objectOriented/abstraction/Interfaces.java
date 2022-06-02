package com.objectOriented.abstraction;

public class Interfaces implements Animal
{
    public void eat()
    {
        System.out.println("eeating");
    }

    public static void main(String args[])
    {

    }
}

interface Animal
{
    void eat();

}
