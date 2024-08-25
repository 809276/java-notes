package com.strings;
//Write a program to create a new string repeating every character twice of a given string

public class Repeating_Char24 {

	public String repeat(String str) 
	{
	  int l = str.length();
	  String new_str = "";
	  for (int i = 0; i < l; i++) 
	  {
		new_str += str.substring(i,i+1) + str.substring(i, i+1);
	  }
	  return new_str;
	}
	public static void main (String[] args)
	{
		Repeating_Char24 m= new Repeating_Char24();
		String str =  "Java";
		System.out.println("Given string : "+str);
		System.out.println("Repeating Every Character in String : "+m.repeat(str));
	}
}
