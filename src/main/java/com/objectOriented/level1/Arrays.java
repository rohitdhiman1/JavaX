package com.objectOriented.level1;

public class Arrays
{
    public static void main(String args[])
    {
        //integer array
        // Way 1 - initialize with size
        // for integer array, all elements will be initialized to 0 value
        int[] array = new int[2];
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println("================================");

        //Way 2 - assigning entire elemnts
        int[] array_new = {1,2,4,5,79};

        // for loop
        for(int i=0; i < array_new.length ; i++)
        {
            System.out.println(array_new[i]);
        }
        System.out.println("================================");

        array[0]= 23;
        array[1]= 2;
        //for each loop
        for(int j : array)
        {
            System.out.println(j);
        }
        System.out.println("================================");

        // 2D - array

        //Way 1
        int[][] a = new int[2][2];

        //Way 2
        int[][] b = {{4,5},{8,1}};


        //how to access elements in 2d array?
        //Example - accessing 2nd element in the first array of 2-D array
        System.out.println(b[0][1]);
        System.out.println("================================");



    }
}
