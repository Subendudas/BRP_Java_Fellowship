package com.bridgelabz.day3;

import java.util.Scanner;

public class Windchill 
{
	static double t = 0;
    static double v = 0;
	 static void getInput(double t, double v) 
		{
			double wind = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
			wind = (int)(wind*100)/100.0;
			System.out.println("Wind chill value is: " + wind + " units.");
		}
	 static void calculation() 
	 {
		 if (Math.abs(t) <= 50) 
			{
				if (v >= 3 && v <= 120) 
				{
					getInput(t, v);
				} 
				else
					System.out.println("Wrong input! Wind-Speed cannot be higher than 120 or less than 3");
			} 
			else
				System.out.println("Temperature cannot be higher than 50 degree Fahrenheit in absolute value");
	 }

	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
        System.out.println("Enter the outside temperature (Fahrenheit) [less then 50]:");
        t = reader.nextInt();
        System.out.println("Enter the wind speed [3 to 120]:");
        v = reader.nextInt();
        reader.close();
        calculation();
		

	}

}
