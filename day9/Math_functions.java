package com.bridgelabz.day9;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

import java.util.Scanner;

public class Math_functions {
	
	
	
	static float harmonic(float num) {
		float result = 1;
		float i;
	   
	    	for(i=2;i<=num;i++) {
	           result = result + (1 / i);
	       
	          }
	  return result;
		
	}
	static float cal_sin(float num) 
	{
		float accuracy = (float) 0.0001, denominator, sinx, sinval;

		num = num * (float) (3.142 / 180.0);

		float x1 = num;
		sinx = num;
		sinval = (float) sin(num);
		int i = 1;
		do {
			denominator = 2 * i * (2 * i + 1);
			x1 = -x1 * num * num / denominator;
			sinx = sinx + x1;
			i = i + 1;
		} while (accuracy <= sinval - sinx);
		return sinx;
	}
	
	static float cal_cos(float num)
	{
			float accuracy = (float) 0.0001, x1, denominator, cosx, cosval;

			num = num * (float) (3.142 / 180.0);
			x1 = 1;

			cosx = x1;

			cosval = (float) cos(num);
			int i = 1;
			do {
				denominator = 2 * i * (2 * i - 1);
				x1 = -x1 * num * num / denominator;
				cosx = cosx + x1;
				i = i + 1;

			} while (accuracy <= cosval - cosx);
			
			return cosx;

		}
	static void decToBinary(int num)
    {
       
        int[] binaryNum = new int[1000];
        int i = 0;
        while (num > 0) 
        {
           
            binaryNum[i] = num % 2;
            num = num / 2;
            i++;
        }
   
      
        for (int j = i - 1; j >= 0; j--)
          System.out.print(binaryNum[j]);
    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" For Harmonic number press-1, For Sin press-2, For Cos press-3\n For Decimal To Binary press-4");
		System.out.println("\nEnter your choice: ");
		int choice=sc.nextInt();
		if(choice==1 || choice==2 || choice==3) {
		System.out.println("Enter Number: ");
		float num=sc.nextFloat();	
		
		if(choice==1) {
		System.out.println("Harmonic number: "+harmonic(num));}
		if(choice==2) {
		System.out.println("Sin: "+cal_sin(num));}
		if(choice==3) {
		System.out.println("Cos: "+cal_cos(num));}
		}
		else if(choice==4) {
			System.out.println("Enter Number: ");
			int num=sc.nextInt();	
		decToBinary(num);
		}
		sc.close();

	}

}
