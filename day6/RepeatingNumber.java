package com.bridgelabz.day6;



public class RepeatingNumber 
{
	static void findRepeating(int[] array, int n) 
	{

		for(int i = 0; i < n; i++) 
		{  
            for(int j = i + 1; j < n; j++) 
            {  
                if(array[i] == array[j])  
                    System.out.println(array[j]);
            }
		}
	}

	public static void main(String[] args) 
	{
		 int array[]=new int[100];
		int n = 100;
		findRepeating(array, n);

	}

}
