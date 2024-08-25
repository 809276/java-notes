package com.arrays;

import java.util.Scanner;

//Write a program to find the maximum and minimum element in an array
public class Array_Max_Min10 {

	public static void main(String[] args)
	{   
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the Array Limit :");
		int l =input.nextInt();
		int [] a =new int[l];
		int max=0,min=0;
		for(int i=0;i<l;i++)
		{
			System.out.printf("Element of a[%d] :",i);
			a[i]=input.nextInt();
		}		
		max=a[0];//max
		min=a[0];//min
		for(int i=0;i<l;i++)
		{
			if(max<a[i])
				max=a[i];
			if(min>a[i])
				min=a[i];
		}
		System.out.println("Maximum Element of Array : "+max);
		System.out.println("Minimum Element of Array : "+min);
    }
}
