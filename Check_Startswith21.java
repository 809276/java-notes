package com.strings;
//Write a program to check whether a given string starts with the contents of another string

public class Check_Startswith21 {

	public static void main(String[] args)
	{
		String str1 = "Orange is Favorite Fruits";
		String str2 = "Grapes is also my favorite Fruits";
 
		String start = "Grapes";
 
		boolean s1 = str1.startsWith(start);
		boolean s2 = str2.startsWith(start);
 
		System.out.println("\""+str1 + "\" starts with \"" +start + "\" ? " + s1);
		System.out.println("\""+str2 + "\" starts with \"" +start + "\" ? " + s2);
	}
}
