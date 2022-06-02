package com.collections.collections;

import java.util.ArrayList;

public class Sample
{
    public static void main(String args[])
    {
        String[] stringArray = new String[3];

        String[] stringArray1 = {"wjcdbudw","dwcjbwucd","feiief"};

        stringArray[0] = "khife";
        stringArray[1] = "eue";
        stringArray[2] = "vhs";

        int[] intArray =  new int[3];
        int[] intArray1 = {1,2,3,4,5};

        intArray[0]= 23;
        intArray[1]=73;
        intArray[2] =39;


        ArrayList<String> arrayList_sample = new ArrayList<String>();

        arrayList_sample.add("kwcndiwd");
        arrayList_sample.add("csncoi");
        arrayList_sample.add("kenfi");
        arrayList_sample.add("dvjkniv");

        System.out.println(arrayList_sample);

        System.out.println(arrayList_sample.size());

        arrayList_sample.remove("kwcndiwd");
        arrayList_sample.remove(0);

        System.out.println(arrayList_sample);




    }
}
