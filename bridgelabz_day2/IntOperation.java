package com.bridgelabz_day2;

import java.util.Scanner;

public class IntOperation 
{
	static void operations(int a, int b, int c) 
	{
		System.out.println("Given arithmetic operations are as follows:-");
		System.out.println("1. a+b*c = "+ (a + b * c));
		System.out.println("2. a*b+c = "+ (a * b + c));
		System.out.println("3. c+a/b = "+ (c + a / b));
		System.out.println("4. a%b+c = "+ (a % b + c));
		
	}

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);

        // Input three numbers from user
        System.out.println("Enter First number :");
        int a = sc.nextInt();
        System.out.println("Enter Second number :");
        int b = sc.nextInt();
        System.out.println("Enter Third number :");
        int c = sc.nextInt();
        sc.close();
        operations(a,b,c);
	}

}
