package com.bridgelabz.day7;

import java.util.Scanner;

public class Second_Largest_and_smallest {
	public static void second_largest(int[]array, int size) {
		for(int i=0;i<size;i++) {
			for(int j=i+1; j<size; j++) {
				if(array[i]<array[j]) 
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
				
			}
			
			}
		System.out.println("Second Largest Number is "+array[1]);
	}
		
		public static void second_smallest(int[]array, int size) {
			for(int i=0;i<size;i++) {
				for(int j=i+1; j<size; j++) {
					if(array[i]>array[j]) 
					{
						int temp=array[i];
						array[i]=array[j];
						array[j]=temp;
					}
					
				}
				
			}
		System.out.println("Second Smallest Number is "+array[1]);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array.");
		int size = sc.nextInt();
		System.out.println("Enter the element");
		int[]array= new int [size];
		for (int i=0; i<size; i++) 
		{
			array[i]=sc.nextInt();
		}
		sc.close();
		 second_largest(array,size);
		 second_smallest(array,size);

}
}
