package com.p1.recursion;

public class RecursionPractice1
{
    public static void printHighToLow(int n)
    {
        System.out.println(n);
        if(n == 1)
            return;
        printHighToLow(n-1);
    }

    public static void printLowToHigh(int n)
    {
        System.out.println(n);
        if (n==5)
            return;
        printLowToHigh(n+1);
    }

    public static int sumFirstXNumbers(int n)
    {
        if(n ==1)
            return 1;
        return n + sumFirstXNumbers(n-1);
    }

    public static void printsumFirstXNumbers(int i, int n, int summ)
    {
        if(i == n)
        {
            summ = summ +i;
            System.out.println(summ);
            return;
        }

        summ = summ +i;
        System.out.println(summ);
        printsumFirstXNumbers(i+1,n, summ);
    }

    public static int factorial(int n)
    {
        if(n ==1)
            return 1;
        return n * factorial(n-1);
    }

    public static void printFibonacci(int a, int b, int n)
    {
        if( n ==0 )
            return;
        int c = a+b;
        System.out.println(c);
        printFibonacci(b,c, n-1);
    }

    public static int calculatePower(int x, int n)
    {
        if(x ==0)
            return 0;
        if(n ==0)
            return 1;

        int xnm1 = calculatePower(x, n-1);
        int xn = x * xnm1;
        return xn;
    }

    public static int calcPower(int x, int n)
    {
        if(x ==0)
            return 0;
        if(n==0)
            return 1;

        int result;

        if(n %2 ==0)
        {
            System.out.println("x " + x);
            System.out.println("n " + n);
            result = calcPower(x, n/2) * calcPower(x, n/2);
            System.out.println("result " + result);
        }
        else
        {
            System.out.println("x " + x);
            System.out.println("n " + n);
            result = calcPower(x, n/2) * calcPower(x, n/2) * x;
            System.out.println("result " + result);
        }
        return result;
    }

    public static void main(String args[])
    {
        //printLowToHigh(1);
        //System.out.println(sumFirstXNumbers(57));
        //printsumFirstXNumbers(1,5,0);
        //System.out.println(factorial(5));

        /*
        int a=0;
        int b=1;
        int n=7;
        System.out.println(a);
        System.out.println(b);
        printFibonacci(a,b,n-2);
         */

        //System.out.println(calculatePower(2,27));

        //System.out.println(calcPower(2,5));

    }
}
