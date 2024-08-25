package com.strings;
//Write a program to Swap Two Strings

public class Swap_String27 {
	public static void main(String args[])
	{
		String str1 = "Computer";
		String str2 = "Science";
		String t_str;
		System.out.println("Before Swap String 1 :"+str1);
		System.out.println("Before Swap String 2 :"+str2);
		t_str = str1;
		str1 = str2;
		str2 = t_str;
		System.out.println("After Swap String 1 :"+str1);
		System.out.println("After Swap String 2 :"+str2);
	}
}
