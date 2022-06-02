package com.mulithreading;

public class MultithreadingThing extends Thread
{
    int threadNumber;
    MultithreadingThing(int threadNumber)
    {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run()
    {
        for(int i=0; i < 5; i++)
        {
            System.out.println("Thread number " + this.threadNumber + " output " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }

        }


    }

    public static void main(String args[])
    {

    }
}
