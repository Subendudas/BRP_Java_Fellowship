package com.bridgelabz.day4;

import java.util.Scanner;

public class TempConv {
	Scanner sc = new Scanner(System.in);
	void conversionCtoF() {
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature in Celcius : ");
		float tempC = sc.nextFloat();
	    float result = (tempC * 9 / 5) + 32;
		System.out.println("Celcius to Fehrenheit is : " + result+" F");
		
	}
	void conversionFtoC() {
		System.out.println("Enter Temperature in Fahrenheit : ");
		float tempF = sc.nextFloat();
		float result = (tempF - 32) * 5 / 9;
		System.out.println("Fehrenheit to Celcius is : " + result+" C");
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
   System.out.println("1 for  Fahrenheit to Celcius, 2 for Celcius to Fahrenheit");
   int choice = sc.nextInt();
   TempConv obj = new TempConv();
   switch(choice) {
   case 1:
	   obj.conversionFtoC();
	   break;
   case 2:
	   obj.conversionCtoF();
   }
   sc.close();
	}

}
