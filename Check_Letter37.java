package com.strings;
//Write a program to check if the letter is present in the word

public class Check_Letter37 {

	public static void main(String[] args)
	{
		String str = "String Exercises";
		boolean pre = false;
		for(int i = 0;i<str.length();i++)
		{
			if(str.charAt(i) == 'x')
			{
				pre=true;
				break;
			}
		}
		System.out.println(pre);
	}
}
