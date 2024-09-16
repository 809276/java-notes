package com.collections.set;

import java.util.HashSet;

//Write a Java program to Removing elements of the hashset
public class Removing_Elements15 {
	public static void main(String args[])
	{
		HashSet <String> h_set= new HashSet <String>();
		h_set.add("Blue");
		h_set.add("Green");
		h_set.add("Black");
		h_set.add("Orange");
		h_set.add("White");
		h_set.add("Pink");
		h_set.add("Yellow");
		System.out.println("Given HashSet : " + h_set);
 
		//removing elements
		h_set.remove("White");
		h_set.remove("Green");
 
		System.out.println("Removing Elements HashSet : " + h_set);		
	}
}
