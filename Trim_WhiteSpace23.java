package com.strings;
//Write a program to trim any leading or trailing whitespace from a given string

public class Trim_WhiteSpace23 {

	public static void main(String[] args)
	{
		String str = "	Computer	";
		String new_str = str.trim();
		System.out.println("Given String :" + str);
		System.out.println("After Trim White Space in String :" + new_str);
	}
}
