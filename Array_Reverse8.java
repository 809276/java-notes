package com.arrays;

import java.util.Scanner;

//Write a program to read n number of values in an array and display in reverse order
public class Array_Reverse8 {
	public static void main(String[] args)
	{   
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the Array Limit :");
		int l =input.nextInt();
		int [] a =new int[l];
		for(int i=0;i<l;i++)
		{
			System.out.printf("Element of a[%d] :",i);
			a[i]=input.nextInt();
		}
		System.out.println("\nDisplay Reverse Order in Array Elements...\n");
		for(int i=l-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
    }
}
