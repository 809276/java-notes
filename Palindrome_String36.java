package com.strings;
//Write a program How to check Palindrome String

public class Palindrome_String36 {

	public static void main(String[] args)
	{   
		System.out.println(Palindrome.check_Palindrome("java"));
		System.out.println(Palindrome.check_Palindrome("madam"));
	}  
}  
class Palindrome
{
	public static boolean check_Palindrome(String str)
	{  
		StringBuilder s = new StringBuilder(str);  
		s.reverse();  
		String rev = s.toString();  
		if(str.equals(rev))
		{
			return true;  
		}
		else
		{
			return false;  
		}
	}
}
