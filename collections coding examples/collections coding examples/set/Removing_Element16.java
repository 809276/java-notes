package com.collections.set;

import java.util.HashSet;

//Write a Java program to Adding duplicate elements to HashSet
public class Removing_Element16 {
	public static void main(String args[])
	{
		HashSet <String> h_set= new HashSet <String>();
		h_set.add("Blue");
		h_set.add("Green");
		h_set.add("Black");
		h_set.add("Orange");
		h_set.add("White");
		h_set.add("Yellow");
		h_set.add("Pink");
		System.out.println("Given HashSet : " + h_set);
		//Addition of duplicate elements in HashSet 
		h_set.add("Yellow");
		h_set.add("Blue");
 
		System.out.println("Display HashSet Elements : "+h_set);
	}
}
