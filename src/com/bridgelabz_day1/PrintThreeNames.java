package com.bridgelabz_day1;

import java.util.Scanner;

public class PrintThreeNames 
{
	Scanner sc = new Scanner(System.in);
	void names() 
	{
	System.out.println("Type Three Names : ");
	String[] arr = new String[3];
	
	for (int i = 0; i < arr.length; i++)   
	{  
	arr[i] = sc.nextLine();  
	} 
	System.out.println("-----------------");
	System.out.println("Hi " +arr[2]+ ", Hi " +arr[1]+ ", Hi " +arr[0]);
	}

public static void main(String[] args) {
	PrintThreeNames obj = new PrintThreeNames();
	obj.names();
	
}
}
