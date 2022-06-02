package com.collections.collections.queue;

class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


public class Test
{



    public static void main(String args[])
    {
        /*
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();


        for(Map.Entry<Integer, String> entry : map1.entrySet())
        {
            //System.out.println("key " + entry.getKey() + " + value " + entry.getValue());
        }

        String arr[] = new String[5];

        arr[0] = "a";
        arr[1] = "b";
        arr[2] = "c";
        arr[3] = "d";
        arr[4] = "e";

        String number = "23726";
        String number_arr[] = number.split("");

        for(int i =0; i < number_arr.length ; i++)
        {
            if(number_arr[i].equals(Character.toString('3')))
            System.out.println(number_arr[i]);
        }



        String a = "efbuef";
        //System.out.println(a.length());
        char temp = a.charAt(5);
        if(a.charAt(5) == 'f')
        {
            //System.out.println("yes");
        }

        char z = 0;
        char x = 0;
        System.out.println(z);

        if(z == x)
        {
            System.out.println("rbife");
        }

        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);


        Queue<Node> q1 = new LinkedList<Node>();
        Node n1 = new Node(2);
        Node n2 = new Node(2);
        Node n3 = new Node(2);
        q1.add(n1);
        q1.add(n2);
        q1.add(null);
        q1.add(n3);

        q1.remove();
        q1.remove();
        q1.remove();

        //System.out.println(q1);
        //System.out.println(q1.isEmpty());

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        //System.out.println(result);
        ArrayList<Integer> temp_list = new ArrayList<Integer>();
        result.add(temp_list);
        result.get(0).add(7);
        result.get(0).add(8);
        result.get(0).add(9);
        //System.out.println(result);
        result.add(temp_list);


        String sample = "RedBull";
        System.out.println(sample);
        Stack<Character> s = new Stack<Character>();
        for(int i=0; i< sample.length() ; i++)
        {
            s.push(sample.charAt(i));
        }

        String result_str ="";
        while(!s.isEmpty())
        {
            result_str += s.pop();
        }
        System.out.println(result_str);

        int[] arr_temp = new int[5];
        System.out.println(arr_temp[0]);
        System.out.println(arr_temp[1]);
        System.out.println(arr_temp[2]);
        System.out.println(arr_temp[3]);
        System.out.println(arr_temp[4]);


        LinkedList<Integer> a = new LinkedList<Integer>();
        LinkedList<Integer> b = a;

        System.out.println(a.getClass());
        System.out.println(b.getClass());
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(a.equals(b));

        System.out.println("abfir".charAt(0) - 'a');


        int j=1;
        int k=11;

        while(j >0 && k > 0)
        {
            System.out.println("lenoe");
            k--;
        }
        */


        String a = "";
        a +="uebiev".charAt(0);
        a +="uebiev".charAt(1);
        a +="uebiev".charAt(2);
        System.out.println(a);






    }
}
