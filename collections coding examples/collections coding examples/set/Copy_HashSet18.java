package com.collections.set;

import java.util.HashSet;

//Write a Java program to Copy Set content to another HashSet
public class Copy_HashSet18 {
	public static void main(String a[])
	{
		HashSet<String> h_set = new HashSet<String>();
		h_set.add("Blue");
		h_set.add("Green");
		h_set.add("Black");
		h_set.add("Orange");
		h_set.add("White");
		System.out.println(h_set);
 
		HashSet<String> sub_set = new HashSet<String>();
		sub_set.add("Pink");
		sub_set.add("Yellow");
		sub_set.add("Purple");
		h_set.addAll(sub_set);
		System.out.println("Copy Set content to another HashSet ..");
		System.out.println(h_set);
	}
}
