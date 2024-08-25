package com.strings;
//Write a program to concatenate a given string to the end of another string

public class Concat_TwoString7 {
	public static void main(String[] args)
	{
		String str1 = "Sathya prakash ";
		String str2 = "Computer Educations";
 
		System.out.println("String 1: " + str1);
		System.out.println("String 2: " + str2); 
 
		String str3 = str1.concat(str2);
		System.out.println("Concatenated string: " + str3);
	}
}
