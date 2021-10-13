package com.bridgelabz.day8;

import java.util.Scanner;

public class RecursivePermutation {
	private static void swap(char[] ch, int i, int j)
    {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

	private static void permutations(char[] ch, int currentIndex)
    {
        if (currentIndex == ch.length - 1) {
            System.out.print(String.valueOf(ch)+" ");
        }
        for (int i = currentIndex; i < ch.length; i++)
        {
            swap(ch, currentIndex, i);
            permutations(ch, currentIndex + 1);
            swap(ch, currentIndex, i);
        }
    }
	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
	        String str1;
	        System.out.println("Enter your String : ");
	        str1 = sc.nextLine();
	        permutations(str1.toCharArray(), 0);
	        sc.close();
		

	}

}
