package com.bridgelabz.day6;

import java.util.Scanner;

public class RollDie {
	private static void checkOccurrenceOfDieNumbers(int turns) 
	{
        int arr[]= new int[6];
        for(int j=1;j<=turns;j++)
        {
            int p = (int) (Math.random() * 6)+1;
            System.out.print(" "+p);
            switch (p){
                case 1:
                    arr[0] = arr[0] + 1;
                    break;
                case 2:
                    arr[1] = arr[1] + 1;
                    break;
                case 3:
                    arr[2] = arr[2] + 1;
                    break;
                case 4:
                    arr[3] = arr[3] + 1;
                    break;
                case 5:
                    arr[4] = arr[4] + 1;
                    break;
                case 6:
                    arr[5] = arr[5] + 1;
                    break;
                default:
                    System.out.println("invalid input");
            }

        }
	System.out.println("\nMain numbers:1 ,2 ,3 ,4 ,5 ,6 ");
        System.out.println("Occurrence of main number:");
        System.out.print("             ");
        for(int  i=0;i< 6;i++){
            System.out.print(+arr[i]+"  ");}

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many turns you want to perform:");
        int turns=sc.nextInt();
        RollDie.checkOccurrenceOfDieNumbers(turns);
        sc.close();
    }

}

