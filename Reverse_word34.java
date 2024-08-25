package com.strings;
//Write a program to reverse words in a given string

public class Reverse_word34 {
	public static String reverse_word(String str)
	{
		StringBuilder rv = new StringBuilder(str);
		String rev = rv.reverse().toString();
 
		String[] words = rev.split(" ");
		StringBuilder reverse = new StringBuilder();
		for (String w: words)
		{
			rv = new StringBuilder(w);
			reverse.append(rv.reverse() + " ");
		}
		reverse.deleteCharAt(reverse.length() - 1);
		return reverse.toString();
	}
	public static void main(String[] args)
	{
		String str = "Tutor Joes Computer Education";
		System.out.println("Given String : " + str);
		System.out.println("Reversed Words in String : " + reverse_word(str));
	}
}
