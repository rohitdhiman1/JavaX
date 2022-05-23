package com.googlekickstart.roundC.q2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        Set<Character> special_character_set = new HashSet<Character>(Arrays.asList('#', '&', '@', '*'));
        int t = in.nextInt();
        for (int i = 1; i <= t; ++i)
        {
            //int n = in.nextInt();

            int n = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();

            boolean result_flag = false;

            int sum = n* (n+1) /2;
            //System.out.println("sum " + sum);

            for(int k=1; k <= n ; k++)
            {
                int alan_sum = k;
                int barbara_sum = sum - k;
                if( (alan_sum/barbara_sum) == x/y )
                {
                    System.out.println("Case #" + i + ": " + "POSSIBLE");
                    System.out.println("1");
                    System.out.println(k);
                    result_flag = true;
                    System.out.println("break");
                    break;
                }
            }

            if(!result_flag)
                System.out.println("Case #" + i + ": " + "IMPOSSIBLE");


            /*

            String input_str = in.next();

            System.out.println("Case #" + i + ": " + input_str);
            String [] input_arr_str = input_str.split(" ");
            int[] input_arr = new int[3];
            for(int j=0; j < input_arr_str.length ; j++)
            {
                input_arr[j] = Integer.parseInt(input_arr_str[j]);
            }
            */

            System.out.println(n);
            System.out.println(x);
            System.out.println(y);

        }


    }
}
