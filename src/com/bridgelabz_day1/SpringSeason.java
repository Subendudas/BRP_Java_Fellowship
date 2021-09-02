package com.bridgelabz_day1;

import java.util.Scanner;

public class SpringSeason {
void check() {
	int M, D;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Month: ");
	M=sc.nextInt();
	System.out.println("Enter Day: ");
	D=sc.nextInt();	
	if((M == 3 && D >= 20 && D <= 31)||(M == 4 && D >=  1 && D <= 30)||(M == 5 && D >=  1 && D <= 31)||(M == 6 && D >=  1 && D <= 20))
		System.out.println("True");
	else
		System.out.println("False");
		
	sc.close();
}

public static void main(String[] args) 
{
	
	SpringSeason obj1 = new SpringSeason();
	obj1.check();
}
}
