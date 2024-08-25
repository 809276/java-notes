package com.arrays;

import java.util.Scanner;

//Write a program to array elements print all Positive number
public class ArrayNum_Positive18 {
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
		System.out.println("\nPositive Array Elements...\n");
		for(int p:a)
		{
			if(p>0)
				System.out.println(p);
		}
    }
}
