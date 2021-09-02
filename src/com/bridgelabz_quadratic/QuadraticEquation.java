package com.bridgelabz_quadratic;

import java.util.Scanner;

public class QuadraticEquation 
{
	static void Eqlogic() 
	{
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the value of a: ");  
		float a = sc.nextFloat();  
		
		System.out.print("Enter the value of b: ");  
		float b = sc.nextFloat();  
		
		System.out.print("Enter the value of c: ");  
		float c = sc.nextFloat(); 
		
		double d = b * b - 4.0 * a * c;
		if (d> 0)   
		{  
		double Root1 = (-b + Math.pow(d, 0.5)) / (2 * a); 
		double Root2 = (-b - Math.pow(d, 0.5)) / (2 * a);  
		System.out.println("The roots are " + Root1 + " and " + Root2);  
		}   
		else if (d == 0)   
		{  
		double r1 = -b / (2 * a);  
		System.out.println("The Root is " + r1);  
		}   
		else   
		{  
		System.out.println("Roots are not real.");  
		}  
		  
		sc.close();
	}
	
	public static void main(String[] args) 
	{
		Eqlogic();
	}

}
