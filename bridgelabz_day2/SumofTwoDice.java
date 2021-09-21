package com.bridgelabz_day2;

public class SumofTwoDice 
{
	static void rolling() 
	{
		    int die1;  
	        int roll;
	        int die2;    
	        
	        die1 = (int)(Math.random()*6) + 1;
	        die2 = (int)(Math.random()*6) + 1;
	        roll = die1 + die2;
	        
	        System.out.println("Rolling first die gives: " + die1);
	        System.out.println("Rolling second die gives: " + die2);
	        System.out.println("Your sum is : " + roll);
	}

	public static void main(String[] args) 
	{
		rolling();
		
	}

}
