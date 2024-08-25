package com.strings;
//Write a program How to search a word inside a string?

public class Search_Word30 {
	public static void main(String[] args)
	{
		String str = "Soma Divya Computer Education";
		int in = str.indexOf("Computer");
		if(in == - 1)
		{
			System.out.println("Computer Not Found");
		}
		else
		{
			System.out.println("Found Computer at Index " + in);
		}
	}
}
