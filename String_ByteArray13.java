package com.strings;
//Write a program to get the contents of a given string as a byte array

public class String_ByteArray13 {
	public static void main(String[] args)
	{
		String str1 = "This is a sample String.";
		byte[] bytearr = str1.getBytes();
		String str2 = new String(bytearr);
		System.out.println("The new String equals " +str2);
	}
}
