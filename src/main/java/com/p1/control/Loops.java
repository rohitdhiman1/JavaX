package com.p1.control;

public class Loops
{
    public static void main(String args[])
    {

        //Single for loop
        for(int i =0; i <5; i++)
        {
            //System.out.println(i);
        }

        System.out.println("=========================");

        // Nested for loop
        for(int x=0; x < 3; x++)
        {
            for(int y=0; y < 2 ; y ++)
            {
                //System.out.println(y);
            }
        }

        System.out.println("=========================");

        //For-each loop
        int array1[] = {1,2,3,4,5};

        for (int p:array1)
        {
            //System.out.println(p);
        }

        System.out.println("=========================");

        // Labelled for loops

        label1:
        for(int s=0; s <5 ; s++)
        {
            label2:
            for(int t =0; t< 3 ; t++)
            {
                //System.out.println(t);
                //break label1;
                //break label2;
            }
            //break label1;
        }

        System.out.println("=========================");

        //While loops

        int w =1;
        while(w < 5)
        {
            System.out.println(w);
            w++;
        }


        // do while loops
        int i = 1;

        do
        {
            System.out.println("Inside do block");
            i++;
        }
        while( i < 3);



    }

}
