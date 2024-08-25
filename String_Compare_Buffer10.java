package com.strings;
//Write a program to compare a given string to the specified string buffer

public class String_Compare_Buffer10 {
	public static void main(String[] args)
	{
		String str1 = "Mahesh Soma";
		String str2 = "Computer Education";
		StringBuffer buffer = new StringBuffer(str1);
 
		System.out.println("Comparing '"+str1+"'"+" and '"+buffer+"' : "+ str1.contentEquals(buffer));
		System.out.println("Comparing '"+str2+"'"+" and '"+buffer+"' : "+ str2.contentEquals(buffer));		
	}
}
