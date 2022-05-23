package com.googlekickstart.roundC.q1;//package com.googlekickstart.roundC;
import java.util.*;
import java.io.*;
public class Solution
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        Set<Character> special_character_set = new HashSet<Character>(Arrays.asList('#', '&', '@', '*'));
        //System.out.println(in);
        int t = in.nextInt();
        for (int i = 1; i <= t; ++i)
        {
            int n = in.nextInt();
            String old_password = in.next();
            boolean special_char_flag = false;
            boolean lower_case_flag = false;
            boolean upper_case_flag = false;
            boolean digit_flag = false;

            int j=0;
            while(j < old_password.length())
            {
                if(special_char_flag && lower_case_flag && upper_case_flag && digit_flag)
                {
                    break;
                }

                //special character
                if (special_character_set.contains(old_password.charAt(j)))
                {
                    special_char_flag = true;
                }

                //digit
                if ( (int) old_password.charAt(j) >= 48 && (int) old_password.charAt(j) <= 57 )
                {
                    digit_flag = true;
                }

                //upper case
                if ( (int) old_password.charAt(j) >= 65 && (int) old_password.charAt(j) <= 90 )
                {
                    upper_case_flag = true;
                }

                //lower case
                if ( (int) old_password.charAt(j) >= 97 && (int) old_password.charAt(j) <= 122 )
                {
                    lower_case_flag = true;
                }
                j++;
            }

            if(!upper_case_flag)
            {
                old_password += "A";
            }

            if(!lower_case_flag)
            {
                old_password += "a";
            }
            if(!digit_flag)
            {
                old_password += "0";
            }
            if(!special_char_flag)
            {
                old_password += "#";
            }
            if(old_password.length() < 7)
            {
                int delta = 7- old_password.length();
                while(delta != 0)
                {
                    old_password += "a";
                    delta--;
                }
            }

            System.out.println("Case #" + i + ": " + old_password);

        }


    }
}
