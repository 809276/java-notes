package com.strings;
//Write a program to Count Number of Uppercase and Lowercase letters

public class Count_Case40 {

	static void charCase_Count(StringBuffer str)
	{
		int lwr=0,upr=0,len = str.length();
		for (int i = 0; i < len; i++) {
			Character c = str.charAt(i);
			if (Character.isLowerCase(c))
				lwr+=1;
			else if (Character.isUpperCase(c))
				upr+=1;
			// else
				// oth+=1;
		}
 
		System.out.println("Number of UpperCase  : "+upr);
		System.out.println("Number of LowerCase  : "+lwr);
	}
	public static void main(String[] args)
	{
		StringBuffer str = new StringBuffer("Tutor Joes");
		charCase_Count(str);
	}
}
