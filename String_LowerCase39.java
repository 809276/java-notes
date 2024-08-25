package com.strings;
//Write a program to Given string Convert Uppercase to Lowercase

public class String_LowerCase39 {
	static void convert_lowercase(StringBuffer str)
	{
		int len = str.length();
		for (int i = 0; i < len; i++) {
			Character c = str.charAt(i);
			if (Character.isUpperCase(c))
				str.replace(i, i + 1,Character.toLowerCase(c) + "");
		}
	}
 
	public static void main(String[] args)
	{
		StringBuffer str = new StringBuffer("Welcome Joes Computer Education");
		System.out.println("Given String : "+str);
		convert_lowercase(str);
		System.out.println("Convert LowerCase : "+str);
	}
}
