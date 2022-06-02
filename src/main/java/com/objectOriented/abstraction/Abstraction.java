package com.objectOriented.abstraction;

public class Abstraction
{
    public static void main(String args[])
    {
        Car c = new BMW();
        System.out.println(c.getClass());
        c.start();
    }
}

class Audi extends Car
{
    @Override
    void start()
    {
        System.out.println("Audi started");
    }
}

class BMW extends Car
{
    @Override
    void start()
    {
        System.out.println("BMW started");
    }
}

abstract class Car
{
    String brand;
    int price;
    abstract void start();

    void stop()
    {
        System.out.println("stopped");
    }

}