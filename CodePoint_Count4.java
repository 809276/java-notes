package com.strings;
//Write a program to count a number of Unicode code points in the specified text range of a String
public class CodePoint_Count4 {
	public static void main(String[] args)
	{
		String str = "Sathya Keerthi";
		System.out.println("Given String : " + str);
		int c = str.codePointCount(1, 10);
		System.out.println("Codepoint count : " + c);
	}
}
