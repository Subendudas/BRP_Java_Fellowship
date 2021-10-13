package com.bridgelabz.day8;

import java.util.Arrays;
import java.util.Scanner;

public class StringFunctions {
	

	static void isAnagram(String string1, String string2) {  
        String s1 = string1.replaceAll("\\s", "");  
        String s2 = string2.replaceAll("\\s", "");  
        boolean status = true;  
        if (string1.length() != string2.length()) {  
            status = false;  
        } else {  
            char[] ArrayS1 = string1.toLowerCase().toCharArray();  
            char[] ArrayS2 = string2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        if (status) {  
            System.out.println(s1 + " and " + s2 + " are Anagrams.");  
        } else {  
            System.out.println(s1 + " and " + s2 + " are not Anagrams.");  
        }  
    }
	
	
	
	
  


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

			System.out.println("Enter the First String: ");
			String string1 = sc.nextLine();
			System.out.println("Enter the Second String: ");
			String string2 = sc.nextLine();
			isAnagram(string1,string2);
			sc.close();
			}
			
			}
		