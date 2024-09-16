package com.collections.set;

import java.util.HashSet;
import java.util.Iterator;

//Write a Java program to Traverse over the elements of the hashset
public class Traverse_Elements14 {
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
 
		//Creating object of Iterator class
 
		Iterator it = h_set.iterator();
 
		System.out.println("Printing out hashset using iterator..");
 
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
