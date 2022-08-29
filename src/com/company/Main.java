package com.company;

public class Main
{

    public static void main(String[] args)
    {
	    boolean weekday = true, vacation = false;

        if ((weekday && vacation) == true)
            System.out.println("James sleeps late");
        else
            System.out.println("James sleeps early");
    }
}
