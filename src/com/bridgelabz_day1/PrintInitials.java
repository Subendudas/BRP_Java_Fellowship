package com.bridgelabz_day1;

import java.util.Scanner;


public class PrintInitials {
	Scanner sc = new Scanner(System.in);
	
	void PrintInit() 
	{
		//int n=9,i,j;
	System.out.println("Enter Name: ");
	//n=sc.nextInt();
	for(int i=1;i<=9;i++)
	{
		for(int j=1;j<=9;j++) 
		{	
			if(i==j||i+j==10)
		 //if(i==1||i==(n/2)+1||j==1||j==n)
			System.out.print("**");
else
			System.out.print(" ");
}
System.out.println();
}
}
public static void main(String[] args) 
{
	PrintInitials obj = new PrintInitials();
	obj.PrintInit();
}
}