package com.bridgelabz_day2;

public class Distance 
{

	public static void main(String[] args)
	
{
		 double distance;
		 double x=Double.parseDouble(args[0]);
		 double y=Double.parseDouble(args[1]);
		 distance = Math.sqrt(Math.pow(x,x) + Math.pow(y,y));
         System.out.println("Distance = " + distance);

}

}
