package com.strings;
//Write a program to test if a given string contains the specified sequence of char values

public class String_Contains8 {
	public static void main(String[] args)
	{
		String str1 = "Amul Keer Computer Educations";
		String str2 = "Computer";
		String str3 = "Computers";
		System.out.println("Given String : " + str1);
		System.out.println("Specified Sequence of char Values : " + str2);
		System.out.println(str1.contains(str2));
		System.out.println("\nSpecified Sequence of char Values : " + str3);
		System.out.println(str1.contains(str3));
	}
}
