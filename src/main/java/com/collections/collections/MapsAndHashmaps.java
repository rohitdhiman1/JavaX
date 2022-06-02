package com.collections.collections;

import java.util.HashMap;
import java.util.*;
import java.util.Map;

public class MapsAndHashmaps
{
    public static void main(String args[])
    {
        HashMap<String,Integer> employee_map = new HashMap<String, Integer>();

        // Add key value pairs to the hashmap
        employee_map.put("Robin",89);
        employee_map.put("Barney",56);
        employee_map.put("Ted",55);
        employee_map.put("Ted",10);

        System.out.println(employee_map);

        // fetch values via key
        System.out.println(employee_map.get("Robin"));

        System.out.println(employee_map.containsKey("Ted"));

        System.out.println(employee_map.containsValue(78));

        Hashtable<String,String> map1 = new Hashtable<String,String>();
        map1.put("ABC","A");
        map1.put("DE","C");
        map1.put("UEB","D");

        System.out.println("-----");
        for(Map.Entry<String,String> entry : map1.entrySet())
        {
            String k = entry.getKey();
            String v = entry.getValue();
            System.out.println(k + " " + v);
        }







    }

    static
    {
        LinkedList<Boolean> list1 = new LinkedList<Boolean>();
    }

}
