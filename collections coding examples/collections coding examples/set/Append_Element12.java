package com.collections.set;

import java.util.HashSet;

//Write a Java program to append the specified element to the end of a hash set
public class Append_Element12 {
	public static void main(String[] args)
	{
		HashSet<String> h_set = new HashSet<String>();
		h_set.add("C");
		h_set.add("JAVA");
		h_set.add("CPP");
		h_set.add("PYTHON");
		h_set.add("MYSQL");
		h_set.add("RUBY");
		System.out.println("Given HashSet : " + h_set);
	}
}
