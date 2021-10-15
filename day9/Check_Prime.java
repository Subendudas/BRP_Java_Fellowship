package com.bridgelabz.day9;

import java.util.Scanner;

public class Check_Prime {
	static boolean  isPrime(int num) {
		if (num%2==0) {
			System.out.println("Prime");
			return true;}
		
		else {
			System.out.println("Not Prime");
			return false;
			
			}
		
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numaber: ");
		int num =sc.nextInt();
		sc.close();
		System.out.println(isPrime(num));
		
	}

}
