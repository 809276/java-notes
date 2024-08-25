package com.strings;
//Write a program to Swap Two Strings without Third String Variable

public class Swap_Without_Third28 {
	public static void main(String[] args)
	{
		String s1 = "Sathya";
		String s2 = "Prakash";
		System.out.println("Before Swap String 1 :"+s1);
		System.out.println("Before Swap String 2 :"+s2);
		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		display(s1, s2);
	}
	private static final void display(String s1, String s2)
	{
		System.out.println("After Swap String 1 :"+s1);
		System.out.println("After Swap String 2 :"+s2);
	}
}
