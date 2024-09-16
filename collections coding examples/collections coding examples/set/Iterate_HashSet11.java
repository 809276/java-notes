package com.collections.set;

import java.util.HashSet;
import java.util.Iterator;

//Write a Java program to iterate through all elements in a hash list
public class Iterate_HashSet11 {
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
		Iterator<String> it = h_set.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
