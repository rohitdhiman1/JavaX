package com.mulithreading;

public class Multithreading
{
    public static void main(String args[])
    {

        for(int x = 0; x < 5; x++)
        {
            MultithreadingThing t = new MultithreadingThing(x);
            t.start();
        }

        //MultithreadingThing thing1 = new MultithreadingThing();
        //MultithreadingThing thing2 = new MultithreadingThing();
    }
}
