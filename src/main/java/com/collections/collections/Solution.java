package com.collections.collections;

class Solution {
    public static void rescursiveExample(int x)
    {
        int summ=0;
        int index =0;

        if(index ==100)
        {
            summ = summ + x;
            System.out.println(summ);
            return;
        }

        summ = summ + x;
        index = index +x;
        rescursiveExample(x+1);
    }

    public static void main(String args[])
    {
        Solution s = new Solution();

        int n =100;
        rescursiveExample(n);

    }

}