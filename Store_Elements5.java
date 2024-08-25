package com.arrays;

import java.util.Scanner;

//Write a program to store elements in an array and print it
public class Store_Elements5 {
	public static void main(String[] args)
	{   
		Scanner input =new Scanner(System.in);
		int [] a =new int[7]; 
		for(int i=0;i<7;i++)
		{
			System.out.printf("Element of a[%d] :",i);
			a[i]=input.nextInt();
		} 
		System.out.println("\nDisplay Array Elements...\n");
		for(int e:a)
		{
			System.out.println(e);
		}
    }
}
