package com.strings;
//Write a program to get the character (Unicode code point) at the given index within the String

public class Unicode_Point3 {

	public static void main(String[] args)
	{
		String str = "Welcome Java";
		System.out.println("Given String : " + str);
		int v1 = str.codePointAt(0);
		int v2 = str.codePointAt(6);
		System.out.println("Character :"+str.charAt(0)+"\nUnicode Point : " + v1);
		System.out.println("Character :"+str.charAt(6)+"\nUnicode Point : " + v2);
	}
}
