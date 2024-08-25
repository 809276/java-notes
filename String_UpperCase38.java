package com.strings;
//Write a program to Given string Convert Lowercase to Uppercase

public class String_UpperCase38 {
	static void convert_uppercase(StringBuffer str)
	{
		int len = str.length();
		for (int i = 0; i < len; i++) {
			Character c = str.charAt(i);
			if (Character.isLowerCase(c))
				str.replace(i, i + 1,Character.toUpperCase(c) + "");
		}
	}
 
	public static void main(String[] args)
	{
		StringBuffer str = new StringBuffer("Rapid Dora Computer Education");
		System.out.println("Given String : "+str);
		convert_uppercase(str);
		System.out.println("Convert UpperCase : "+str);
	}
}
