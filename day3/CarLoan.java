package com.bridgelabz.day3;

import java.util.Scanner;

public class CarLoan {
	static void payment(float Principal,float Year,float RateOfInterest) 
	{
		double Payment;
		 float n= 12*Year;
		 float r= RateOfInterest/(12*100);
		 Payment  = (Principal * r) / (1 - Math.pow(1+r, -n));
			System.out.println("Monthly Payments : " + Payment);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		float Principal, Year, RateOfInterest;
		System.out.println("Enter Loan Amount : ");
		Principal = sc.nextFloat();
		System.out.println("Enter Year : ");
		Year = sc.nextFloat();
		System.out.println("Enter Rate : ");
		RateOfInterest = sc.nextFloat();
		sc.close();
		
		payment( Principal, Year,RateOfInterest);
	}

}
