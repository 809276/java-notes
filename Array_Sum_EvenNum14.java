package com.arrays;

import java.util.Scanner;

//Write a program to array elements to print sum of Even Numbers
public class Array_Sum_EvenNum14 {
	public static void main(String[] args)
	{   
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the Array Limit :");
		int l =input.nextInt();
		int [] a =new int[l];
		int sum = 0;
		for(int i=0;i<l;i++)
		{
			System.out.printf("Element of a[%d] :",i);
			a[i]=input.nextInt();
		}
		for(int e:a)
		{
			if(e%2==0)
				sum = sum + e;
		}		
		System.out.println("Sum of Even Array Elements : "+sum);
    }
}
