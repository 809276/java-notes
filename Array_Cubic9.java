package com.arrays;

import java.util.Scanner;

//Write a program to array elements to print cubic values
public class Array_Cubic9 {
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
		System.out.println("\nCubic Array Elements...\n");
		for(int e:a)
		{
			System.out.println(e*e*e);
		}
    }
}//find out maximum number in given array
