package com.bridgelabz.day4;

import java.util.Scanner;

public class Sqrt {
	static void calculation(double c, double l) {
		double t = c;  
	        double epsilon = 1e-15;
	        while (Math.abs(t - c/t) > epsilon*t) 
	        {
	            t = (c/t + t) / 2.0;
	        }
	        System.out.println(t);
	}
	public static void main(String args[]) {
		Scanner cs = new Scanner(System.in);
		double c, l;
		System.out.println("Enter Value of C : ");
		c = cs.nextDouble();
		System.out.println("Enter Value of L : ");
		l = cs.nextDouble();
		calculation(c, l);
		cs.close();
		
		
	}

}
