package com.bridgelabz.day8;

import java.util.Scanner;

public class Palindrome {
	static void isPalindrome(String string) {
		String rev = "";
		int length = string.length();

        for ( int i = length - 1; i >= 0; i-- )
            rev = rev + string.charAt(i);

        if (string.equals(rev))
            System.out.println(string+" is a palindrome");
        else
            System.out.println(string+" is not a palindrome");
	}

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
       String string = sc.nextLine();
       isPalindrome(string);
       sc.close();

	}

}
