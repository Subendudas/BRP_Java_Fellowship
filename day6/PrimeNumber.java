package com.bridgelabz.day6;

import java.util.Scanner;

public class PrimeNumber {
	static void logic() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Lower Limit");
		int l =sc.nextInt();
		System.out.println("Enter Upper Limit");
		int u=sc.nextInt();
		System.out.println("Prime Numbers Between "+l+" and "+u+" are: ");
		sc.close();
		rangecheck(l,u);
		
	}
	static void rangecheck(int l,int u) 
	{
		
		int i ,j,count;
		for(j=l+1;j<u;j++) 
		{
			count=0;
			for(i=1;i<=j;i++) 
			{
				if(j%i==0)
					count++;
			}
			if (count==2)
				System.out.println(j+"");
		}
		}
	

	public static void main(String[] args)
	{
		logic();
		//rangecheck(l,u);
		//Scanner sc= new Scanner(System.in);
		//System.out.println("Press Q to Quit the program.");
		//String choice=sc.nextLine();
		//sc.close();
		/*while(choice!= "q") 
		{
			logic();
		}*/
	}
}

	