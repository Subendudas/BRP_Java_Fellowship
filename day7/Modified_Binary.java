package com.bridgelabz.day7;

import java.util.Scanner;

public class Modified_Binary {
	static int swapNibbles(int input)
	{
		
	   return ((input & 0x0F) << 4 | (input & 0xF0) >> 4);
	}
	 
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any decimal number: ");
		int input = sc.nextInt();
	    System.out.print(swapNibbles(input));
	    sc.close();
	}

}
