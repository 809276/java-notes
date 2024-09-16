package com.collections.set;

import java.util.HashSet;

//Write a Java program to empty an hash set
public class Empty_HashSet9 {
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
		h_set.removeAll(h_set); // Remove all elements
		System.out.println("HashSet After Removing all the Elements : "+h_set);   
	}
}
