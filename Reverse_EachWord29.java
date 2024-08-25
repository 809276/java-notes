package com.strings;
//Write a program to Reverse Each Word of a String

public class Reverse_EachWord29 {

	public static void main(String[] args)
	{
		reverseEachWord("String and String function");
	}
	private static String reverseEachWord(String str)
	{
		String[] words = str.split(" ");
		String rev = "";
		for (String word: words)
		{
			rev = rev + reverseWithStringConcat(word) + " ";
		}
		display(str, rev);
		return rev;
	}
	private static final String reverseWithStringConcat(String string)
	{
		String rev_word = "";
		for (int i = (string.length() - 1); i >= 0; i--)
		{
			rev_word = rev_word + string.charAt(i);
		}
		return rev_word;
	}
	private static final void display(String str, String rev)
	{
		System.out.println(str);
		System.out.println(rev);
	}
}
