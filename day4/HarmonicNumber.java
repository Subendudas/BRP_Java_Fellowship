package com.bridgelabz.day4;

import java.util.Scanner;

public class HarmonicNumber 
{
static void calculation(int num)
{
	double result = 0.0;
    while(num > 0)
      {
           result = result + (float) 1 / num;
          num--;
      }
    System.out.println("");
    System.out.println("Output of Harmonic Series is "+result);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for n : ");
		int num = sc.nextInt();
		sc.close();
		calculation(num);
		
}
}