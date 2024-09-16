package com.collections.set;

import java.util.HashSet;
//Write a Java program to Copy all elements from HashSet to an array
public class CopyHashSet_ToArray19 {
	public static void main(String a[])
	{
		HashSet<String> h = new HashSet<String>();
		h.add("C");
		h.add("JAVA");
		h.add("CPP");
		h.add("PYTHON");
		h.add("MYSQL");
		h.add("RUBY");
		System.out.println("HashSet : "+h);
 
		String[] arr = new String[h.size()];
 
		h.toArray(arr);
		System.out.println("Copy all elements from HashSet to an Array : ");
		for(String e : arr)
		{
			System.out.println(e);
		}
	}
}
