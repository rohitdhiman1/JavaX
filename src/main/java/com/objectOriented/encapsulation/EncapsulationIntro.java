package com.objectOriented.encapsulation;

public class EncapsulationIntro
{
    public static void main(String args[])
    {
        EncapsulationIntro a = new EncapsulationIntro();
        a.doWork();

        Laptop l1 = new Laptop();
        l1.setPrice(324);

    }

    private void doWork()
    {
        System.out.println("working working");
    }
}

class Laptop
{
    int ram;
    private int price;

    public void setPrice(int price)
    {
        this.price = price;
    }
}
