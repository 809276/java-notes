package com.strings;
//Write a program to find maximum between two string

import java.util.Scanner;

public class Maximum_String35 {

	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the String 1 :");
		String str1 = input.nextLine();
		System.out.print("Enter the String 2 :");
		String str2 = input.nextLine();
		int len1 = str1.length();
		int len2 = str2.length();
		if(len1>len2)
			System.out.println(str1+" is Maximum String..");
		else if(len2>len1)		
			System.out.println(str2+" is Maximum String..");
		else			
			System.out.println(str1+" or "+str2+" Both are Same Length");
	}
}
