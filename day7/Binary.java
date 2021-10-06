package com.bridgelabz.day7;

import java.util.Scanner;

public class Binary {
	static void decimalToBinary(int input) 
	{
		int[] binaryNum = new int[1000];
        int i = 0;
        while (input > 0) 
        {
            binaryNum[i] = input % 2;
            input = input / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
        	
            System.out.print(binaryNum[j]);
            
            }
    }
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any decimal number: ");
		int input = sc.nextInt();
		decimalToBinary(input);
		sc.close();
	}
}
