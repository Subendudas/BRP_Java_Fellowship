package com.bridgelabz_day1;

import java.util.Scanner;

public class Leapyear{
	int year;
	boolean leap;
	Scanner sc = new Scanner(System.in);
	void Leapyearcheck() 
	{
		System.out.println("Enter Year: ");
		year=sc.nextInt();
		    if (year % 4 == 0) 
		    {
		      if (year % 100 == 0) 
		      {
		        if (year % 400 == 0)
		          leap = true;
		        else
		          leap = false;
		      }
		      else
		        leap = true;
		    }
		    else
		      leap = false;

		    if (leap)
		      System.out.println(year + " is a leap year.");
		    else
		      System.out.println(year + " is not a leap year.");
		  }
	 public static void main(String[] args) {
		 Leapyear leapcheck = new Leapyear();
		 leapcheck.Leapyearcheck();
	 }
		}