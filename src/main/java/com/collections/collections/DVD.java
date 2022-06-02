package com.collections.collections;

public class DVD
{
    public String name;
    public int releaseYear;
    public String director;

    public DVD(String name, int year, String director)
    {
        this.name = name;
        this.releaseYear = year;
        this.director = director;

    }

    public String toString()
    {
        return this.name + ", directed by " + this.director + ", released in year " + this.releaseYear;
    }

    public static void main(String args[])
    {
        DVD[] dvdCollection = new DVD[15];

        DVD dvd1 = new DVD("Batman1" ,2016,"ABC");
        DVD dvd2 = new DVD("Batman2" ,2018,"ABC");
        DVD dvd3 = new DVD("Batman3" ,2019,"ABC");
        DVD dvd4 = new DVD("Spiderman" ,2022,"XYZ");
        dvdCollection[7] = dvd1;
        dvdCollection[3] = dvd2;
        dvdCollection[10] = dvd3;
        dvdCollection[3] = dvd4;

        for(DVD i : dvdCollection )
        {
            System.out.println(i);
        }


    }

}
