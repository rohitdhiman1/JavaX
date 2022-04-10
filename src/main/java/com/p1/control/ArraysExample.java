package com.p1.control;
import java.util.Arrays;
import java.util.ArrayList;

public class ArraysExample
{


    public static void main(String mofo[])
    {

        //intialize array with values
        int[] array1 = {4,8,1,3,9};

        for (int j : array1)
        {
            //System.out.println(j);
        }

        // Sort an array
        Arrays.sort(array1);

        for (int i=0; i < array1.length ; i++)
        {
            //System.out.println(array1[i]);
        }

        //initialize array with size
        int[] sized = new int[10];

        for(int j=0; j< sized.length; j ++)
        {
            sized[j] = j*100;
        }

        for (int v : sized)
        {
            //System.out.println(v);
        }


        // Boolean array
        boolean[] boolArray = new boolean[4] ;
        boolArray[0] =true;
        boolArray[1] = false;
        boolArray[2] =true;
        boolArray[3] =true;

        for ( boolean a : boolArray)
        {
            //System.out.println(a);
        }


        // Comparing Array with ArrayList
        String[] arrayString = {"one","two","three"};
        ArrayList<String> arrayListString = new ArrayList<String>(Arrays.asList("one", "two", "three"));

        // Accessing values via index
        //System.out.println(arrayString[0]);
        //System.out.println(arrayListString.get(0));

        // get size
        //System.out.println(arrayString.length);
        //System.out.println(arrayListString.size());

        // printing array and array list
        System.out.println(arrayString);  // prints memory address
        System.out.println(arrayListString);

        //set an element
        arrayString[0] = "Aloha";
        arrayListString.set(0,"Shell");

        //System.out.println(arrayString[0]);
        //System.out.println(arrayListString.get(0));

        // Things that you can't do with an array
        // Adding an element
        //arrayListString.add("Five");
        //System.out.println(arrayListString.get(3));

        //Deleting an element

        //System.out.println(arrayListString.get(0));
        // delete by index
        //arrayListString.remove(0);
        //System.out.println(arrayListString.get(0));

        // delete by value
        //arrayListString.remove("Shell");
        //System.out.println(arrayListString.get(0));



    }
}
