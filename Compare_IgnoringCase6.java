package com.strings;
//Write a program to compare two strings lexicographically , ignoring case differences

public class Compare_IgnoringCase6 {
	public static void main(String[] args)
	{
		String str1 = "Java Exercise";
		String str2 = "java exercise";        
		System.out.println("String 1 : " + str1);
		System.out.println("String 2 : " + str2); 
		int res = str1.compareToIgnoreCase(str2);
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
