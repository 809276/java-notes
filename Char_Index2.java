package com.strings;
//Write a program to get the character at the given index within the String
public class Char_Index2 {

	public static void main(String[] args)
	{
		String str = "sathya keerthi";
		System.out.println("Given String : " + str);
		int a = str.charAt(0);
		int b = str.charAt(6);
		System.out.println("The Character at Position 0 is " +(char)a);           
		System.out.println("The Character at Position 6 is " +(char)b);
	}
}
