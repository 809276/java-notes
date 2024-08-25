package com.strings;
//Write a program to print after removing duplicates from a given string

public class Remove_Duplicates32 {

	public static void main(String[] args)
	{
		String str = "Java Exercises";
		System.out.println("Given String : " + str);
		removeDuplicate(str);
	}
	private static void removeDuplicate(String s)
	{
		char[] arr = s.toCharArray();
		String str = "";
		for (char e: arr)
		{
			if (str.indexOf(e) == -1)
			{
				str += e;
			}
		}
		System.out.println("After Removing duplicates characters in string is: " + str);
	}
}
