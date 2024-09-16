package com.collections.set;

import java.util.HashSet;

//Write a Java program to Adding ArrayList elements to HashSet
public class ArrayList_HashSet17 {
	public static void main(String args[])
	{
		HashSet <String> arr = new HashSet <String>();
		arr.add("Blue");
		arr.add("Green");
		arr.add("Black");
		arr.add("Orange");
		arr.add("White");
		arr.add("Pink");
		System.out.println("Given HashSet : " + arr);
 
		//copying ArrayList elements to HashSet
		HashSet<String> h_set =new HashSet(arr);
 
		//adding another element to HashSet after copy
		h_set.add("Yellow");
		h_set.add("Purple");
 
		System.out.println("HashSet Elements : "+h_set);
	}
}
