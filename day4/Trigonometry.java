package com.bridgelabz.day4;

import java.util.Scanner;

public class Trigonometry {
	static void trigo(int choice,float num) {
	double radian = Math.toRadians(num);
	System.out.println(num+" degree into radian = "+radian);
	{
		switch(choice) 
		{
		case 1:
			System.out.println( "Sin = "+Math.sin(radian));
			break;
			
		case 2:
			System.out.println("Cos = " +Math.cos(radian));
			break;
		case 3:
			System.out.println("Tan= "+ Math.tan(radian));
		}
		
	}
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose a trigonometric operation.\n 1 for Sin.\n 2 for Cos. \n 3 for Tan.");
		int choice=sc.nextInt();
		System.out.println("Enter Angle (in degrees): ");
		float num = sc.nextFloat();
		sc.close();
		trigo(choice,num);
	}

}
