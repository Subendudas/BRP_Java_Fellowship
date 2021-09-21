package com.bridgelabz.day3;

public class Stats5 {
	float randomnumber=0;
	static void random() 
	{
		float[] array=new float[5];
		int i,max=5;
		float total=0;
		for ( i = 0; i < max; i++) 
		 {
			float randomnumber=(float) Math.random();
			System.out.println(randomnumber+", ");
			array[i]=randomnumber;
			total=total+array[i];
		}
		System.out.println("");
		System.out.println("Average:- "+total/5);
	}
		

	public static void main(String[] args) 
	{
		System.out.println("Five Random Numbers Are:- ");
		random();
		

}
}
