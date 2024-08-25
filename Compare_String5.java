package com.strings;
//Write a program to compare two strings lexicographically Two Strings

public class Compare_String5 {

	public static void main(String[] args)
	{
		String str1 = "Java Exercise";
		String str2 = "Java Exercise";        
		System.out.println("String 1 : " + str1);
		System.out.println("String 2 : " + str2); 
		int res = str1.compareTo(str2);
		if (res < 0)
		{
			System.out.println("String 1" +" is less than " + "String 2");
		}
		else if (res == 0)
		{
			System.out.println("String 1 "+"is equal to " +"String 2");
		}
		else
		{
			System.out.println("String 1 "+"is greater than " +"String 2 ");
		}
	}
}
