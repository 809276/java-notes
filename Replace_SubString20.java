package com.strings;
//Write a program to replace each substring of a given string

public class Replace_SubString20 {
	public static void main(String[] args)
	{
		String str1 = "String and String Function";
		String str2 = str1.replaceAll("String", "Java");
		System.out.println("Given String : " + str1);
		System.out.println("After String Replace : " + str2);
	}
}
