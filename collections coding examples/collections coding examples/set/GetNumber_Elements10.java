package com.collections.set;

import java.util.HashSet;

//Write a Java program to get the number of elements in a hash set
public class GetNumber_Elements10 {

	public static void main(String[] args)
	{
		HashSet<String> h_set = new HashSet<String>();
		h_set.add("Blue");
		h_set.add("Green");
		h_set.add("Black");
		h_set.add("Orange");
		h_set.add("White");
		h_set.add("Pink");
		h_set.add("Yellow");
		System.out.println("Given HashSet : " + h_set);	
		System.out.println("Number of Elements in Hash Set : " + h_set.size());
	}
}
