package com.bridgelabz.day8;

import java.util.Scanner;

public class IterativePermutation {
	static void isIterativePermutation(String string, String ans) {
		if (string.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            String ros = string.substring(0, i) + string.substring(i + 1);
            isIterativePermutation(ros, ans + ch);
        }
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
       String string1 = sc.nextLine();
       isIterativePermutation(string1,"");
       sc.close();
		

	}

}
